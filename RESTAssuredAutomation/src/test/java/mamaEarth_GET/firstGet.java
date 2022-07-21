package mamaEarth_GET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class firstGet {
	
	@Test
	public void test_1() {
		Response response = get("https://mmrth-nd-api.honasa-production.net/v1/content/contentfulBanners");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.time());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Date"));
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getHeader("Content-Length"));
		System.out.println(response.getHeader("Connection"));


	}
	
	@Test
	public void test_2() {
		given().get("https://mmrth-nd-api.honasa-production.net/v1/content/contentfulBanners").then().body("data[0].primaryBanners.desktopBannerContent[0].title", equalTo("Tea tree"));
	}
}
