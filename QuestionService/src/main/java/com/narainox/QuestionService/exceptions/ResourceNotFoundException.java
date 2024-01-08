package com.narainox.QuestionService.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private String resource;
    private String type;
    private Object value;

    public ResourceNotFoundException(String question, String questionId, Integer questionId1) {
        super(String.format("%s not found %s : %s",question,questionId,questionId1));
    }

    public ResourceNotFoundException(String message) {
        super("Resource Not Found");
    }
}
