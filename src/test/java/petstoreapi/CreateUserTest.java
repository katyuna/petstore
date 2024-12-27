package petstoreapi;

import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import petstore.model.User;
import petstore.testdata.TestDataGenerator;
import utils.PojoJsonParser;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class CreateUserTest extends BaseTest{

    @DisplayName("Создание пользователя")
    @Description("")
    @Test
    public void testCreateUser() {
        User user = TestDataGenerator.createUser();
        String requestBody = PojoJsonParser.parseToJson(user);

        Allure.step("Создание пользователя");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(baseURI +"/user");
        Allure.step("Проверка статуса ответа");
        response.then().statusCode(200);

    }

}

