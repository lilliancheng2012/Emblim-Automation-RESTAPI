package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class CommunityCommentsTest extends AbstractTest{

	@Test
	public void testCommunityComments() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
		.when().get("https://api.emblim.co/api/communitycomments/comments?commentId=null&communityId=130&communityEventId=undefined&page=1&pageSize=12").then()
		.body("successful", equalTo(true))
		.statusCode(200);
	}
}
