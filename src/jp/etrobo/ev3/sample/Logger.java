package jp.etrobo.ev3.sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	public File file;
	public FileWriter filewriter;

	public Logger() {
		try {
			file = new File("ev3lejos.log");
			filewriter = new FileWriter(file);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void writeLog(String str) {
		try {
			filewriter.write(str);
			filewriter.write("\n");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void closeLogger() {

	}
}