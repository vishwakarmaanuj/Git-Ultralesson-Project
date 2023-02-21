package com.ultraLesson.apiAutomation;

import com.oracle.webservices.internal.api.message.ContentType;
import com.ultraLesson.apiAutomation.request.RequestBody;

import javax.jws.WebParam;
import javax.xml.ws.Response;
import static io.restassured.RestAssured.given;
public class User {
    public Response getAll() {
        Response response =
                given()
                        .header("app-id", "63ea666e5dc514a7728f25e3")
                        .when()
                        .get("https://dummyapi.io/data/v1/user?limit=10");
        response.then()
                .log().body();
        return response;
    }

    public Response getUserAccount() {
        Response response =
                given()
                        .header("app-id", "7738dfvbhsds575nfc")
                        .when()
                        .get("https://dummyapi.io/data/v1/user?created=1");
        response.then()
                .log().body();
        return response;
    }

    public Response create(RequestBody body) {
        Response response =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header("app-id", "63ea666e5dc514a7728f25e3")
                        .body(body)
                        .when()
                        .post("https://dummyapi.io/data/v1/user/create");
        response.then()
                .log().body();
        return response;
    }
}
