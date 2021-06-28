package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;


public class ReadSymptomDataFromFile implements ISymptomReader {
/*
Create a GetSymptoms method.

*/
	@Override
    public List<String> GetSymptoms(File file, List<String> list) { // Method to read the file and count occurences.
       try {
           Scanner readFile = new Scanner(file); // Scanner used to read the file.
           while (readFile.hasNextLine()) {
               String data = readFile.nextLine(); // Data for each next line.
               list.add(data); 
           }
           readFile.close();
           Collections.sort(list); // Array alphabetically sorted.
           System.out.println(list);
       } catch (FileNotFoundException e) { // Instructions if no file is found.
           System.out.println("Error. File is absent.");
           e.printStackTrace();
       }
	   return list;
    }

	
	
}


