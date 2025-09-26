package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiUtils {
    private static final String BASE_URL = "https://reqres.in/api/";

    public static Response get(String endpoint) {
        return RestAssured.given()
                .header("x-api-key", "reqres-free-v1")
                .contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + endpoint);
    }
}
