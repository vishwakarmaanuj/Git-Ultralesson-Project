package com.ultraLesson.apiAutomation.response;

import com.ultraLesson.apiAutomation.request.RequestBody;
import lombok.Data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Data
public class UserResponse {
    private int statusCode;

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public void assertUser(RequestBody userRequestBody) {
        assertEquals(this.getStatusCode(), 200);
        assertNotNull(this.getId());
        assertNotNull(this.getEmail());
        assertEquals(this.getEmail(), userRequestBody.getEmail());
        assertEquals(this.getFirstName(), userRequestBody.getFirstName());
        assertEquals(this.getLastName(), userRequestBody.getLastName());
    }
}
