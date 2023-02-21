package com.ultraLesson.apiAutomation.response;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ErrorResponse {
    @Setter
    private int statusCode;
    private String error;
    private Data data;
    public void assertHasError(String emailErrorMessage) {
        data.emailErrorMessage.equals(emailErrorMessage);
    }

    @Getter
    public static class Data {
        private String emailErrorMessage;
    }
}
