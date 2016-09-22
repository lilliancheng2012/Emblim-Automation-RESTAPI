package co.emblim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class SearchCommunitiesByGameSkillsTest extends AbstractTest{
	
	@Test
    public void testSearchCommunitiesByGameSkills() {
		given()
        .contentType("application/x-www-form-urlencoded")
        .body("{\"SearchTerm\":\"\",\"Games\":[],\"Tags\":[],\"AgeRestriction\":\"3\",\"Page\":1,\"GameSkill\":\"3\",\"LanguagePreference\":\"1\"}")
        .when().post("https://api.emblim.co/api/search/searchcommunities").then()
        .body("successful",equalTo(true))
		.statusCode(200);
    }

}
