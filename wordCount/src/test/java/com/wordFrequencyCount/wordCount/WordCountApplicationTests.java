package com.wordFrequencyCount.wordCount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.wordFrequencyCount.wordCount.bean.Word;
import com.wordFrequencyCount.wordCount.service.WordCountService;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
class WordCountApplicationTests {

	@Value("${str}")
    private String str;
	@Value("${word}")
    private String word;
	
	@Value("${count}")
    private String count;
	@Value("${similarData}")
    private String similarData;
	
	@Autowired
	private WordCountService wordCountService;
	
	@Test
	public void testWordCountFrequency() throws JSONException {

		Long wordCount = wordCountService.wordCount(str, word);

		assertEquals(count, wordCount.toString());
	}
	
	@Test
	public void testSimilarListOfData() throws JSONException {

		String string =  wordCountService.similarWordCount(str, word);

		assertEquals(similarData, string.trim());
	}
}
