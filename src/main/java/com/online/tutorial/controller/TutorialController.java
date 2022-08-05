package com.online.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.tutorial.dao.TutorialJPA;
import com.online.tutorial.entity.Tutorial;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

	@Autowired
	private TutorialJPA tutorialJPA;

	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World !!";
	}

	@GetMapping("/hello-world-new")
	public List<Tutorial> HelloWorld1() {
		Tutorial tutorial = new Tutorial("new java aaa", "the java book aaa", false);
		tutorial.setId(7);
		tutorialJPA.save(tutorial); // one data inseted
		//4 record
		
		//delete
		//tutorialJPA.deleteById((long) (1));
		//3 record
		
		//custom Query
		System.out.println(tutorialJPA.getAllfor2records());
		System.out.println("**********----*********");
		System.out.println(tutorialJPA.findById((long) 3));
		
		System.out.println("***********************");
		List<Tutorial> al = new ArrayList<>();
		al  = tutorialJPA.findAll();
		System.out.println(al);
		return al;
		
		//find by Id
		
	}

}
