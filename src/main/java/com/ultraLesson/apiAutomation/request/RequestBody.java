package com.ultraLesson.apiAutomation.request;

import lombok.Data;

import java.util.UUID;

@Data
public class RequestBody {
    private final String lastName;
    private final String firstName;
    private final String email;

    public RequestBody(Builder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.email = builder.email;
    }

    public static class Builder {
        private final String lastName;
        private final String firstName;
        private String email;

        public Builder() {
            this.lastName = "Vishwakarma";
            this.firstName = "Anuj";
            this.email = String.format("%s@gmail.com", UUID.randomUUID());
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public RequestBody build() {
            return new RequestBody(this);
        }
    }
}
