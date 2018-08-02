package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("swagger测试Controller")
@RestController
@RequestMapping(value="/test")
public class TestController {

	@ApiOperation(value="swagger方法测试",notes="根据传参返回对应的值")
	@RequestMapping(value="/word",method=RequestMethod.GET)
	public String word(@RequestParam("word") String word){
		return word;
	}
	
}
