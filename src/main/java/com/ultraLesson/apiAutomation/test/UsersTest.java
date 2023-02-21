package com.ultraLesson.apiAutomation.test;

import com.ultraLesson.apiAutomation.response.AllUserResponse;
import com.ultraLesson.serviceApi.UserService;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertEquals;

public class UsersTest {
    private UserService usersService;

    @BeforeMethod
    private void beforeClass() {
        usersService = new UserService();
    }

    @Test
    public void shouldGetAllTheUsers() {
        AllUserResponse getAllUserResponse = usersService.getAllUsers();
        getAllUserResponse.assetUser();
    }

    @Test
    public void shouldGetUsersCreatedOnYourAccount() {
        AllUserResponse getAllUserResponse = usersService.getUsersCreatedOnTheAccount();
        assertEquals(getAllUserResponse.getStatusCode(), 200);
        assertEquals(getAllUserResponse.getPage(), 0);
        assertEquals(getAllUserResponse.getLimit(), 20);
    }
}
