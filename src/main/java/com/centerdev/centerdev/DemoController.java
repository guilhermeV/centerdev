package com.centerdev.centerdev;

import org.springframework.boot.SpringApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {


	@RequestMapping( path = "bla", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE )
	public String defaultGet()
	{
		return "bla";
	}

}
