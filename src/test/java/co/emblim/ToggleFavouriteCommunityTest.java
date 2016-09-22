package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class ToggleFavouriteCommunityTest extends AbstractTest{
	@Test
    public void testToggleFavouriteCommunity() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
		.when().get("https://api.emblim.co/api/users/togglefavouritecommunity/130").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
