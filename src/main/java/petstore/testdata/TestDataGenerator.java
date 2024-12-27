package petstore.testdata;

import com.github.javafaker.Faker;
import petstore.model.User;

import java.time.Instant;

public class TestDataGenerator {

     // Генерация уникального id на основе текущего времени - возвращает текущие миллисекунды
    public static Integer generateId() {
        return (int) System.currentTimeMillis();
    }

    public static User createUser(){
        Faker faker = new Faker();
        int id = generateId();
        String username = faker.name().username();
        String firstName = faker.name().firstName();;
        String lastName = faker.name().lastName();;
        String email = faker.internet().emailAddress();;
        String password = faker.internet().password(8, 16, true, true, true);
        String phone = faker.phoneNumber().cellPhone();;
        int userStatus = 1;

        User user = new User(id, username, firstName, lastName, email, password, phone, userStatus);
        return user;
    }


}
