package com.hemebiotech.analytics;

import java.io.File;
import java.util.List;
import java.util.Map;


public class AnalyticsCounter {
	
	ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
	
	/**
	 * @author Alexandre Kuzo
	 * 
	 */

	public List<String> GetSymptoms(File file, List<String> list) {
		return readSymptomDataFromFile.GetSymptoms(file, list);
	}

	/**
	 * 
	 * @author Alexandre Kuzo
	 * 
	 */
	public Map<String, Long> CountSymptoms(List<String> list){
		return readSymptomDataFromFile.CountSymptoms(list);
	}

	
}

