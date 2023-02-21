package com.ultraLesson.serviceApi;

import com.ultraLesson.apiAutomation.User;
import com.ultraLesson.apiAutomation.request.RequestBody;
import com.ultraLesson.apiAutomation.response.AllUserResponse;
import com.ultraLesson.apiAutomation.response.ErrorResponse;
import com.ultraLesson.apiAutomation.response.UserResponse;

import javax.xml.ws.Response;

public class UserService {
    final User user = new User();

    public UserResponse createUser(RequestBody body) {
        Response response = user.create(body);
        UserResponse userResponse = response.as(UserResponse.class);
        userResponse.setStatusCode(response.statusCode());
        return userResponse;
    }

    public ErrorResponse createUserExpectingError(RequestBody body) {
        Response response = user.create(body);
        ErrorResponse createUserErrorResponse = response.as(ErrorResponse.class);
        createUserErrorResponse.setStatusCode(response.statusCode());
        return createUserErrorResponse;
    }

    public AllUserResponse getAllUsers() {
        Response response = user.getAll();
        int statusCode = response.statusCode();
        AllUserResponse getAllUserResponse = response.as(AllUserResponse.class);
        getAllUserResponse.setStatusCode(statusCode);
        return getAllUserResponse;
    }

    public AllUserResponse getUsersCreatedOnTheAccount() {
        Response response = user.getUserAccount();
        int statusCode = response.statusCode();
        AllUserResponse getAllUserResponse = response.as(AllUserResponse.class);
        getAllUserResponse.setStatusCode(statusCode);
        return getAllUserResponse;
    }
}
