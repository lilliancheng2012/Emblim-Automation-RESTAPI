package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class QueryByCommunitiyNameTest extends AbstractTest{
	@Test
    public void testQueryByCommunitiyName() {
		given()
		.when().get("https://api.emblim.co/api/community/community/?slug=game-of-warriors").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
