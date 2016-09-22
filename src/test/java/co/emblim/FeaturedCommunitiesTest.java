package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class FeaturedCommunitiesTest extends AbstractTest{

	@Test
    public void testGetFeaturedCommunities() {
		given()
		.when().get("https://api.emblim.co/api/community/featuredcommunities").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
