package com.ultraLesson.apiAutomation.test;

import com.ultraLesson.apiAutomation.request.RequestBody;
import com.ultraLesson.apiAutomation.response.UserResponse;
import com.ultraLesson.serviceApi.UserService;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {
    private UserService usersService;

    @BeforeClass
    public void beforeClass() {
        usersService = new UserService();
    }

    @Test
    public void shouldCreateUser() {
        RequestBody userRequestBody =
                new RequestBody
                        .Builder()
                        .build();
        UserResponse createUserResponse =
                usersService
                        .createUser(userRequestBody);
        createUserResponse.assertUser(userRequestBody);
    }
}
