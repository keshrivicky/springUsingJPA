package com.online.tutorial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.online.tutorial.entity.Tutorial;
@Repository
public interface TutorialJPA extends JpaRepository<Tutorial,Long>{
	
	@Modifying
	@Query(value="DELETE FROM tutorials WHERE title=:title",nativeQuery = true)
	void deleteByTitle(@Param("title") String title);

}
