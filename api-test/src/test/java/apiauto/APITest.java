package apiauto;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;
import utils.ApiUtils;

import java.io.File;

public class APITest {

    //Test Positive
    @Test
    public void testGetUnknownList() {

        File listUnknownSchema = new File("src/test/resources/jsonSchema/getListUnknownSchema.json");

        ApiUtils.get("unknown")
                .then()
                .log().all()
                .statusCode(200)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(listUnknownSchema));
    }

    //Test Negative
    @Test
    public void testGetSingleUser() {

        File schemaGetSingleUser = new File("src/test/resources/jsonSchema/getSingleUserSchema.json");

        ApiUtils.get("users/200")
                .then()
                .log().all()
                .statusCode(404);
    }

    //Test Batas
    @Test
    public void testGetUsersWithParam() {
        ApiUtils.get("users?page=1&per_page=3")
                .then()
                .log().all()
                .statusCode(200)
                .body("data.size()", org.hamcrest.Matchers.equalTo(3));
    }

}