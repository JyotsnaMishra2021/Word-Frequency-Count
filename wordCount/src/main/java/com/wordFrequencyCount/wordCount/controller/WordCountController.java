package com.wordFrequencyCount.wordCount.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wordFrequencyCount.wordCount.bean.Word;
import com.wordFrequencyCount.wordCount.service.WordCountService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class WordCountController {

	@Autowired
	WordCountService wordCountService;

	@Autowired
	Word wordBean;
	
	private String word;


	@PostMapping("/wordCount") 
	public ResponseEntity<?> getWordCount(@RequestParam("file") MultipartFile file,@RequestParam("input") String inputWord ) {
		try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				String inputData = new String(bytes);
				wordBean.setWordCount(wordCountService.wordCount(inputData, inputWord));
				wordBean.setSimilarDataType( wordCountService.similarWordCount(inputData, inputWord));
				wordBean.setInputWord(inputWord);
			}
		        
		        

		} catch (Exception e) {
			log.info(e.getMessage());
			return new ResponseEntity<>("error occured.Please check data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 return new ResponseEntity<>(wordBean,HttpStatus.OK);
	}

	
	
   

}