package com.narainox.QuestionService.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "question")
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String question;
    String options1;
    String options2;
    String options3;
    String options4;
    String rightAnswer;
    String difficulty;
    String category;
}
