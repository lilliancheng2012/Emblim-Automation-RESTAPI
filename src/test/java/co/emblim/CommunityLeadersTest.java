package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class CommunityLeadersTest extends AbstractTest {

	@Test
	public void testCommunityLeaders() {
		given()
		.when().get("https://api.emblim.co/api/community/communityleaders?communityId=120&page=1").then()
		.body("successful", equalTo(true))
		.statusCode(200);
	}
}
