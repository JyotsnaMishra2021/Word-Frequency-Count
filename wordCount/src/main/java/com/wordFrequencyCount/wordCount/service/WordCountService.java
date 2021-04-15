package com.wordFrequencyCount.wordCount.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class WordCountService {
	

	
	public String similarWordCount(String str, String word) {
		StringBuffer similarData = new StringBuffer();

		String wordCountList[] = str.split(" ");
		String firstthreewords = word.substring(0, 3);
		List<String> wordList = Arrays.asList(wordCountList);

		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).toLowerCase().contains(firstthreewords.toLowerCase())) {
				if (!(wordList.get(i).equals(word))) {
					similarData.append(wordList.get(i)).append(",");

				}

			}
		}
		String similarDataValue = similarData.toString();
		if (similarDataValue.endsWith(",")) {
			similarDataValue = similarDataValue.substring(0, similarDataValue.length() - 1) + " ";
		}
		return similarDataValue;

	}
	
	
	    
	public Long wordCount(String str, String word) {
		String wordCountList[] = str.split(" ");
		List<String> myList = Arrays.asList(wordCountList);
		Long count = myList.stream()
		        .filter(s -> s.contains(word)).count();

		return count;
	}
	
	
}
