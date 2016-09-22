package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class RecentCommunitiesTest extends AbstractTest{
	@Test
    public void testGetRecentCommunities() {
		given()
		.when().get("https://api.emblim.co/api/community/recentcommunities").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
