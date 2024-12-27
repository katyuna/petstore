package base;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setUp() {

        //Устанавливаем базовый URL
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
