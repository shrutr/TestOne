package SwaggerTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;



public class UserTest {


    @Test(priority = 1)
    public void createUsers(){

        List<UserModel> userArray = new ArrayList<>();

        UserModel userDetails = new UserModel();
        userDetails.setId(101);
        userDetails.setUsername("Jack");
        userDetails.setFirstName("Test");
        userDetails.setLastName("One");
        userDetails.setEmail("testone@gmail.com");
        userDetails.setPassword("password");
        userDetails.setPhone("9876543");
        userDetails.setUserStatus(101);

        UserModel userDetails1 = new UserModel();
        userDetails1.setId(102);
        userDetails1.setUsername("Jin");
        userDetails1.setFirstName("John1");
        userDetails1.setLastName("Ben");
        userDetails1.setEmail("john@gmail.com");
        userDetails1.setPassword("pass123");
        userDetails1.setPhone("9876539");
        userDetails1.setUserStatus(102);

        UserModel userDetails2 = new UserModel();
        userDetails2.setId(103);
        userDetails2.setUsername("Red");
        userDetails2.setFirstName("Ron1");
        userDetails2.setLastName("one");
        userDetails2.setEmail("ron@gmail.com");
        userDetails2.setPassword("pass234");
        userDetails2.setPhone("98764443");
        userDetails2.setUserStatus(103);

        userArray.add(userDetails);
        userArray.add(userDetails1);
        userArray.add(userDetails2);

        Response response =

                (Response) given().contentType(ContentType.JSON).body(userArray)
                        .when().post("https://petstore.swagger.io/v2/user/createWithArray").
                        then().assertThat().statusCode(200).extract().body();

        if(response.getStatusCode() == 200) {

            System.out.println(userArray.size() + " Users Created");
        }

    }

    @Test(priority = 2)
    public void userLogin() {
        given()
                .when().get("https://petstore.swagger.io/v2/user/login?username=test&password=12345").
                then().assertThat().statusCode(200).extract().body();

    }

    @Test(priority = 3)
    public void addUser() {
        UserModel userDetails3 = new UserModel();
        userDetails3.setId(50);
        userDetails3.setUsername("Mike");
        userDetails3.setFirstName("Tom");
        userDetails3.setLastName("One");
        userDetails3.setEmail("tom@gmail.com");
        userDetails3.setPassword("pass098");
        userDetails3.setPhone("93346543");
        userDetails3.setUserStatus(50);

        Response response =

                (Response) given().contentType(ContentType.JSON).body(userDetails3)
                        .when().post("https://petstore.swagger.io/v2/user").
                        then().assertThat().statusCode(200).extract().body();


        System.out.println("User created: " + response.getBody().prettyPrint());
    }


    @Test(priority = 4)
    public void getUserDetails() {

        Response response =
                (Response) given()
                        .when().get("https://petstore.swagger.io/v2/user/Mike")
                        .then().assertThat().statusCode(200).extract().body();

       System.out.println("Response Status: " + response.getStatusCode());
       System.out.println(("Response Body: " + response.getBody().prettyPrint()));

    }

    @Test(priority = 5)
    public void userLogout() {
        given()
                .when().get("https://petstore.swagger.io/v2/user/logout").
                then().assertThat().statusCode(200);

    }
}
