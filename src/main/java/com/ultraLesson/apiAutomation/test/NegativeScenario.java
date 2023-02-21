package com.ultraLesson.apiAutomation.test;

import com.ultraLesson.apiAutomation.request.RequestBody;
import com.ultraLesson.apiAutomation.response.ErrorResponse;
import com.ultraLesson.serviceApi.UserService;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NegativeScenario {
    private UserService usersService;

    @BeforeClass
    public void beforeClass(){
        usersService = new UserService();
    }

    @Test
    public void createUserWithExistingEmailID() {
        RequestBody userRequestBody = new RequestBody.Builder().email("anuj@123").build();
        ErrorResponse createUserErrorResponse = usersService.createUserExpectingError(userRequestBody);
        assertEquals(createUserErrorResponse.getStatusCode(), 400);
        assertEquals(createUserErrorResponse.getError(),"BODY_NOT_VALID");
        createUserErrorResponse.assertHasError("This email id is already used");
    }
}
