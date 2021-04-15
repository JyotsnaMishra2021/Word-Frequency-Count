package com.wordFrequencyCount.wordCount.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Word {

	private Long wordCount;
	private String similarDataType;
	private String inputWord;
	
	public Word(String inputWord, String similarDataType) {
		super();
		this.similarDataType = similarDataType;
		this.inputWord = inputWord;
	}
	
}
