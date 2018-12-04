package file_manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileManager {
	private static BufferedReader br;

	public static String read(String fileName) throws IOException {
		String txt = "";
		File file = new File(fileName);
		br = new BufferedReader(new FileReader(file));
		String batch;
		while((batch = br.readLine()) != null)
			txt += batch + '\n';
		return txt;
	}


	public static void write(String fileName, String txt) throws IOException {
		Writer file = new FileWriter(fileName);
		file.write(txt);
		file.close();
	}
}
