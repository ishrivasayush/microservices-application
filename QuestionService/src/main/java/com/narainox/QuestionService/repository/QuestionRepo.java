package com.narainox.QuestionService.repository;

import com.narainox.QuestionService.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
