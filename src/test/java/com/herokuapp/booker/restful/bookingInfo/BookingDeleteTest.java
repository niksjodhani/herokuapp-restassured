package com.herokuapp.booker.restful.bookingInfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class BookingDeleteTest extends TestBase {

    @Test
    public void deleteBookingById() {

        Response response = given()
                .header("Authorization", "Bearer b5f2ee3fca5b4efacce265745546d4fd7f1501611b151cf408ac45f7648bb5d0")
                .header("Content-Type", "application/json")
                .header("Cookie", "token=28528346102147d")
                .pathParam("id", 2117)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }
}
