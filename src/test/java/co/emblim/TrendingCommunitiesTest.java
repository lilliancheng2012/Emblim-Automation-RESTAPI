package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TrendingCommunitiesTest extends AbstractTest{
	@Test
    public void testGetTrendingCommunities() {
		given()
		.when().get("https://api.emblim.co/api/community/trendingcommunities").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
