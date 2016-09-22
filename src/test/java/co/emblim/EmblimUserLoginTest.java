package co.emblim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class EmblimUserLoginTest extends AbstractTest{
	
	@Test
    public void testEmblimUserLogin() {
//		given()
//        .contentType("application/x-www-form-urlencoded")
//        .accept("application/json, text/plain, */*")
//        .body("grant_type=password&username=Lillian&password=Woshibendan1bendan")
//        .when().post("https://api.emblim.co/Token").then()
//        .body("userName",equalTo("Lillian"))
//        .statusCode(200);
//        String body = r.getBody().asString();
//    	System.out.println(body);
		
//		Response r = given()
//        .contentType("application/x-www-form-urlencoded")
//        .accept("application/json, text/plain, */*")
//        .body("grant_type=password&username=Lillian&password=Woshibendan1bendan")
//        .post("https://api.emblim.co/Token");
		
		assertEquals("Lillian",token.getUserName());
		assertNotNull(token.getAccess_token());
  		System.out.println(token.getAccess_token());
		
    }

}
