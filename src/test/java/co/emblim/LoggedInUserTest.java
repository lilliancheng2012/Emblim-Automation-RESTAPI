package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class LoggedInUserTest extends AbstractTest{
	@Test
    public void testGetFeaturedCommunities() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
		.when().get("https://api.emblim.co/api/users/loggedinuser").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
