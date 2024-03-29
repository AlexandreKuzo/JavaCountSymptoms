package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.io.File;


/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	List <String> GetSymptoms (File file, List<String> list);


	/**
	 *  Count occurrences of words after "scanning" it
	 * 
	 * @return a map with key (symptoms) and values (number of occurrences)
	 */
	Map<String, Long> CountSymptoms (List<String> list);
	
}
