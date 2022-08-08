package com.online.tutorial.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.tutorial.dao.TutorialJPA;
import com.online.tutorial.entity.Tutorial;

@Service
@Transactional
public class TutorialService {
	
	@Autowired
	private TutorialJPA tutorialJPA;

	public List<Tutorial> getAllTutorial() {
		List<Tutorial> list =	 tutorialJPA.findAll();
		return list;
	}

	public Optional<Tutorial> getById(int id) {
		Optional<Tutorial> tutorial = tutorialJPA.findById((long) id);
		return tutorial;
	}

	public int createTutorial(Tutorial tutorial) {
		Tutorial value = tutorialJPA.save(tutorial);
		if (value.getId() == tutorial.getId())
			return 1;
		else
			return 0;
	}

	public Tutorial updateTutorial(Tutorial tutorial) {
		Tutorial value = tutorialJPA.save(tutorial);
		return value;
	}

	public void deleteTutorialByID(int id) {
		 tutorialJPA.deleteById((long) id);
		
	}

	public void deleteTutorialByTitle(String title) {
		System.out.println("------------>"+title);
		 tutorialJPA.deleteByTitle(title);
		
	}
	
	

}
