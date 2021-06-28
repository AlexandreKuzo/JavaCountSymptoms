package com.hemebiotech.analytics;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/*
Create an AnalyticsCounter class with GetSymptoms method.

*/

public class AnalyticsCounter {
	
	ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
	/**
	 * @author Alexandre Kuzo
	 * 
	 */

	public List<String> GetSymptoms(File file, List<String> list) {
		return readSymptomDataFromFile.GetSymptoms(file, list);
	}

	
}

