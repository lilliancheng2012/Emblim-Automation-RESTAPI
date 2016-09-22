package co.emblim;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class NotificationsTest extends AbstractTest{
	@Test
    public void testNotifications() {
		given()
		.header("Authorization", BEARER_CONSTANT + token.getAccess_token())
		.when().get("https://api.emblim.co/api/notifications/unacknowledged").then()
		.body("successful",equalTo(true))
		.statusCode(200);
    }
}
