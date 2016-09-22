package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class SearchCommunitiesByTagTest extends AbstractTest{
	@Test
    public void testSearchCommunitiesByTag() {
		given()
        .contentType("application/x-www-form-urlencoded")
        .body("{\"SearchTerm\":\"\",\"Games\":[],\"Tags\":[232],\"AgeRestriction\":\"\",\"Page\":1,\"GameSkill\":\"\",\"LanguagePreference\":\"\"}")
        .when().post("https://api.emblim.co/api/search/searchcommunities").then()
        .body("successful",equalTo(true))
		.statusCode(200);
    }
}
