package macro;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import file_manager.FileManager;

class MacroElement {
	public List<String> parameters;
	public String body;

	public MacroElement(List<String> params) {
		this.parameters = new ArrayList<String>(params);
		this.body = "";
	}
	
	public MacroElement(List<String> params, String body) {
		this.parameters = new ArrayList<String>(params);
		this.body = body;
	}
}

public class Macro {
    private Map<String, MacroElement> tableDefinition = new HashMap<String, MacroElement>();
    private int labelCounter = 0;

    public Macro() {}
    
    public Map<String, MacroElement> getTableDefinition() {
    	System.out.println("---\n");
    	for(Object a : this.tableDefinition.keySet())
    		System.out.println(a);
    	for(MacroElement m : this.tableDefinition.values())
    		System.out.println(m.parameters);
    	for(MacroElement m : this.tableDefinition.values())
    		System.out.println(m.body);
    	return this.tableDefinition;
    }
    
    private void setHeader(String name, StringTokenizer params) {
    	List<String> parameters = new ArrayList<String>();
    	while(params.hasMoreTokens())
    		parameters.add(params.nextToken());
    	MacroElement macroElement = new MacroElement(parameters);
    	this.tableDefinition.put(name, macroElement);
    }
    
    private List<StringTokenizer> tokenize(String txt) {
    	String[] lines = txt.replaceAll("\n{2,}", "\n").replaceAll("^\n|[^:]\\/\\/.*",  "").split("\n");
		List<StringTokenizer> sTokenizer = new ArrayList<StringTokenizer>();
		for(String line : lines)
			sTokenizer.add(new StringTokenizer(line, "[ |\t|,]"));
		return sTokenizer;
    }
    
    private void updateMacroBody() {
    	Pattern pattern;
		Matcher matcher;
    	String param;
    	for(MacroElement macroElement : this.tableDefinition.values()) {
    		for(int i = 0; i < macroElement.parameters.size(); ++i) {
    			param = macroElement.parameters.get(i); 
    			pattern = Pattern.compile("\\b" + param + "\\b");
    			matcher = pattern.matcher(macroElement.body);
    			if(matcher.find())
    				macroElement.body = matcher.replaceAll(new String("\\$" + i));
    		}
    	}
    			
    }
	
	/*	Preprocess raw code
	 *
	 *	@params		raw code
	 *	@return		Expanded code
	 */
	public String preprocess(String code) {
		String finalCode = "", codeLine;
		List<StringTokenizer> lines = this.tokenize(code);
		String token, macroName = "", macroBody = "";
		// True		macro mode
		// False 	normal mode
		Boolean mode = false; 
		// 1 Step
		for(StringTokenizer tokenizer : lines) {
			codeLine = "";
			token = tokenizer.nextToken();
			if(token.equals("macro")) {
				macroBody = "";
				macroName = tokenizer.nextToken();
				this.setHeader(macroName, tokenizer);
				mode = true;
			}
			else if(mode) {
				do {
					// Macro mode
					if(token.equals("endmacro")) {
						this.tableDefinition.get(macroName).body = macroBody;
						mode = false;
						break;
					}
					else
						macroBody += token + (tokenizer.hasMoreTokens() ? ' ' : "");
					if(!tokenizer.hasMoreTokens())
						break;
					token = tokenizer.nextToken();
				} while(true);
				macroBody += '\n';
			}
			else {
				do {
					// Normal mode
					codeLine += token + " ";
					if(!tokenizer.hasMoreTokens())
						break;
					token = tokenizer.nextToken();
				} while(true);
				finalCode += codeLine + '\n';
			}
		}
		
		// 2 Step
		this.updateMacroBody();
		mode = false;
		lines = this.tokenize(finalCode);
		finalCode = "";
		String macroExpanded;
		List<String> params = new ArrayList<String>();
		MacroElement element;
		Pattern pattern = Pattern.compile("\\.SER");
		Pattern patternRealParameter;
		Matcher matcher;
		for(StringTokenizer tokenizer : lines) {
			codeLine = "";
			token = tokenizer.nextToken();
			// Expansion mode
			if(this.tableDefinition.get(token) != null) {
				element = this.tableDefinition.get(token);
				macroExpanded = element.body;
				params.clear();
				// Get all real parameters
				while(tokenizer.hasMoreTokens())
					params.add(tokenizer.nextToken());
				// Replace to real parameters
				for(int i = 0; i < params.size(); ++i) {
					patternRealParameter = Pattern.compile("\\$" + i);
					matcher = patternRealParameter.matcher(macroExpanded);
					macroExpanded = matcher.replaceAll(params.get(i));					
				}
				// Change *.SER to an number
				matcher = pattern.matcher(macroExpanded);
				macroExpanded = matcher.replaceAll("" + this.labelCounter);
				++this.labelCounter;
				finalCode += macroExpanded;
			}
			// Normal mode
			else {
				while(true) {
					codeLine += token + " ";
					if(!tokenizer.hasMoreTokens())
						break;
					token = tokenizer.nextToken();
				}
				finalCode += codeLine + '\n';
			}
		}
		return finalCode;
	}
	
	public void preprocess(String code, String fileName) {
		String processedCode = this.preprocess(code);
		try {
			FileManager.write(fileName.replace(".asm", ".txt"), processedCode);
			System.out.println("Sucess to write on file");
		} catch(IOException err) {
			System.out.println("Erro to write file");
			System.exit(1);
		}
	}
}
