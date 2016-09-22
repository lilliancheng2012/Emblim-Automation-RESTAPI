package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class CommunityUnlikeTest extends AbstractTest{
	@Test
    public void testCommunityUnlike() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
        .contentType("application/json")
        .body("{\"CommunityId\":\"130\"}")
        .when().post("https://api.emblim.co/api/communitylike/unlike").then()
        .body("successful", equalTo(true))
        .statusCode(200);
    }
}
