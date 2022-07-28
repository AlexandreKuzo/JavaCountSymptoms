package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.stream.Collectors;


public class ReadSymptomDataFromFile implements ISymptomReader {
	/** 
	 * Create the GetSymptoms method.
	 * 
	*/



    public List<String> GetSymptoms(File file, List<String> list) { // Method to read the file and count occurences.
       try {
           Scanner readFile = new Scanner(file); // Scanner used to read the file.
           while (readFile.hasNextLine()) {
               String data = readFile.nextLine(); // Data for each next line.
               list.add(data); 
           }
           readFile.close();
           
       } catch (FileNotFoundException e) { // Instructions if no file is found.
           System.out.println("Error. File is absent.");
           e.printStackTrace();
       }
       
	   return list;
    }

	/**
	 * 
	 * Create the CountSymptoms method.
	 * 
	 */


	public Map<String, Long> CountSymptoms(List<String> list) {
		Map<String, Long> output = list.stream()
        .collect(Collectors.groupingBy(e -> e.toString(), TreeMap::new, Collectors.counting()));
        System.out.println(output);

		return output;
	}
	
}


