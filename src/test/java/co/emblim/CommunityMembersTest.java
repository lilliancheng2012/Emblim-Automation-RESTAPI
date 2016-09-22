package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class CommunityMembersTest extends AbstractTest{
	@Test
	public void testCommunityMembers() {
		given()
		.when().get("https://api.emblim.co/api/community/communitymembers?communityId=130&page=1").then()
		.body("successful", equalTo(true))
		.statusCode(200);
	}
}
