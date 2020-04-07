package net.codejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates how to read a text file line by line using the
 * BufferedReader and LineNumberReader classes.
 *
 * @author www.codejava.net
 *
 */
public class ReadTextFileLinesExample {

	public static void main(String[] args) {
		String filePath = "ReadTextFileLinesExample.java";

		// Approach #1: Using BufferedReader class

		try {
			BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
			String lineText = null;

			List<String> listLines = new ArrayList<String>();

			while ((lineText = lineReader.readLine()) != null) {
				listLines.add(lineText);
			}

			lineReader.close();

			for (String line: listLines) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}

		System.out.println("============");

		// Approach #2: Using LineNumberReader class

		try {
			LineNumberReader lineReader = new LineNumberReader(new FileReader(filePath));
			String lineText = null;

			while ((lineText = lineReader.readLine()) != null) {
				System.out.println(lineReader.getLineNumber() + ": " + lineText);
			}

			lineReader.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}