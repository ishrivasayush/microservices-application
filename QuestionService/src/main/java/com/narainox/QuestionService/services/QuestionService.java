package com.narainox.QuestionService.services;

import com.narainox.QuestionService.models.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestion();
    List<Question> getAllQuestionByCategory(String category);
    Question createQuestion(Question question);
    Question updateQuestion(Integer questionId,Question question);
    void deleteQuestion(Integer questionId);
    Question getQuestionById(Integer questionId);
}
