package terminal;

import java.io.*;

import macro.Macro;
import file_manager.FileManager;

public class Terminal {

	public static void main(String[] args) {
		String code = "";
		String fileName = "/home/igor/Documents/Git/PSHacksAssembler/PSHacks/src/terminal/max.asm";
		try {
			code = FileManager.read(fileName);
		} catch(IOException err) {
			System.out.println("Erro to load file");
			System.exit(1);
		} 
		Macro macro = new Macro();
		macro.preprocess(code, fileName);
	}
}
