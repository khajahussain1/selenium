package selenium_interview_questions;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.http.HttpEntity;
import org.codehaus.plexus.util.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.net.MediaType;

import gherkin.deps.com.google.gson.JsonObject;



public class Capcha {
	
	WebDriver driver;
	
/*	@Test
	public void enterCaptchaValue() throws InterruptedException, IOException
	{
		File src = driver.findElement(By.id("captcha")).getScreenshotAs(OutputType.FILE);
		String CaptchaString = this.convertCaptcha(src);
		driver.findElement(By.id("userenteredCaptcha")).sendKeys(CaptchaString);
		Thread.sleep(2000);
		driver.findElement(By.id("login_0")).click();
		System.err.println("Captcha from: "+CaptchaString);
	}
	
	private String convertCaptcha(File captchaImgFile) throws IOException
	{
		System.out.println("test00");
		byte[] bytes = FileUtils.readFileToByteArray(captchaImgFile);
		String base64 = Base64.getEncoder().encodeToString(bytes);
		bytes = new byte[0];
		JSONObject body = new JSONObject();
		if(base64 != null && !base64.isEmpty())
			body.put("base64", base64);
		RestTemplate resttemplate = new RestTemplate();	
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_BINARY);
		//headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity request = new HttpEntity(body.toString(), headers);
		String captchaUrl = "http://staging.grid.in/UtilityService/request/handlecaptcha";
		String captchacode = resttemplate.postForObject(captchaUrl, request, String.class);
		
		System.out.println(captchacode);
		return base64;
		
		//return captchacode;
		
		
			
	}*/

}
