package com.online.tutorial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.online.tutorial.entity.Tutorial;
@Repository
public interface TutorialJPA extends JpaRepository<Tutorial,Long>{
	
	
	@Query(value="SELECT * FROM employee.tutorials limit 2",nativeQuery = true)
	 List<Tutorial> getAllfor2records();

}
