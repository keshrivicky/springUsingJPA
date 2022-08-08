package com.online.tutorial.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.tutorial.dao.TutorialJPA;
import com.online.tutorial.entity.Tutorial;
import com.online.tutorial.service.TutorialService;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

	@Autowired
	private TutorialService tutorialService;
		
	
	@GetMapping("/")
	public List<Tutorial> getAllTutorial(){
		List<Tutorial> list = tutorialService.getAllTutorial();
		return list;
	}
	
	@GetMapping("/{id}")
	public Optional<Tutorial> getByID(@PathVariable("id") int id){
		Optional<Tutorial> tutorial = tutorialService.getById(id);
		return tutorial;
	}
	
	@PostMapping("/")
	public int  createTutorial(@RequestBody Tutorial tutorial){
		int value = tutorialService.createTutorial(tutorial);
		return value;
	}
	
	@PutMapping("/")
	public Tutorial  updateTutorial(@RequestBody Tutorial tutorial){
		Tutorial value = tutorialService.updateTutorial(tutorial);
		return value;
	}
	
	
	@DeleteMapping("/{id}")
	public void  deleteTutorialByID(@PathVariable("id") int id){
		 tutorialService.deleteTutorialByID(id);
		
	}
	
	@DeleteMapping("")
	public void  deleteTutorialByID(@RequestParam("title") String title){
		System.out.println("-->>"+title);
		 tutorialService.deleteTutorialByTitle(title);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World !!";
	}

//	@GetMapping("/hello-world-new")
	//public List<Tutorial> HelloWorld1() {
	//	Tutorial tutorial = new Tutorial("new java aaa", "the java book aaa", false);
	//	tutorial.setId(7);
		//tutorialJPA.save(tutorial); // one data inseted
		//4 record
		
		//tutorialJPA.
		//delete
		//tutorialJPA.deleteById((long) (1));
		//3 record
		
		//custom Query
		//System.out.println(tutorialJPA.getAllfor2records());
	//	System.out.println("**********----*********");
	//	System.out.println(tutorialJPA.findById((long) 3));
		
	//	System.out.println("***********************");
	//	List<Tutorial> al = new ArrayList<>();
	//	al  = tutorialJPA.findAll();
	//	System.out.println(al);
	//	return al;
		
		//find by Id
		
	//}
	
	

}
