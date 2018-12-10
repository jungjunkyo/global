package com.myweb.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.test.vo.TestVO;

@Controller
public class TestController {
	@RequestMapping("/hello")
	public String hello(Model model, @ModelAttribute TestVO vo) {
		System.out.println("asdasdasdsad");
		System.out.println(vo.getNo());
		return "hello";
	}
}
