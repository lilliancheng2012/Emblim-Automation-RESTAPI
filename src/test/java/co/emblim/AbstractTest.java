package co.emblim;

import static io.restassured.RestAssured.expect;

import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public abstract class AbstractTest {
	
	public final static String BEARER_CONSTANT = "Bearer ";
	
	public static Token token;
	
	@BeforeClass
	public static void setup() {
		//Set SSL configuration
		RestAssured.config = RestAssured.config.sslConfig(SSLConfig.sslConfig().allowAllHostnames());
		//Each Test case need login first to get the token
		token =  expect()
		.statusCode(200)
		.given()
        .contentType("application/x-www-form-urlencoded")
        .accept("application/json, text/plain, */*")
        .body("grant_type=password&username=Lillian&password=Woshibendan1bendan")
        .post("https://api.emblim.co/Token")
        .andReturn()
        .body()
        .as(Token.class);
		
//		System.out.println("Token:" + token.getAccess_token());
	}

}
