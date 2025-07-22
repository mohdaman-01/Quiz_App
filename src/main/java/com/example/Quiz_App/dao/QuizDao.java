package com.example.Quiz_App.dao;

import com.example.Quiz_App.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {


}
