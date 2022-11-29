package com.example.demoxwwwformurlencoded;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoXWwwFormUrlencodedApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoXWwwFormUrlencodedApplication.class, args);
	}
	
	@PostMapping(path = "/url-endpoint-test", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String form(@RequestBody MultiValueMap<String, String> formParameters) {



	  List<String> contentValues = formParameters.get("content");


	  String content = formParameters.getFirst("userName");
	  
	  return content;
	}

}
