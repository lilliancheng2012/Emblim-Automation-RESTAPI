package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class MyCommunitiesTest extends AbstractTest{
	@Test
    public void testMyCommunities() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
		.when().get("https://api.emblim.co/api/mycommunities/list").then()
		.body("successful",equalTo(true))
		.statusCode(200);
		
    }
}
