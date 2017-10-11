package com.technoangel.json;

import java.io.FileReader;
import java.io.IOException;

import org.hamcrest.CoreMatchers;
import org.json.simple.*;
import org.json.simple.parser.*;

import org.junit.*;

public class JsonBasicTester {
	
	// --------------------------------------
	// JSON parsing object
	// --------------------------------------

	public static final String JSON_FILE="./source.json";
	
	public JSONObject jsonObject = null;
	
	public JsonBasicTester() {
		buildJsonObject();
	}
	
	public void buildJsonObject() {
		JSONParser parser = new JSONParser();
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(JSON_FILE));
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ----------------------------------------
	// Getters
	// ----------------------------------------
	
	public JSONObject getObject() {
		return jsonObject; 
	}
	
	public String getName() {
		if (jsonObject == null) { return null; }
		return (String) jsonObject.get("name");
	}
	
	public String getRole() {
		if (jsonObject == null) { return null; }
		return (String) jsonObject.get("role");
	}
	
	public JSONObject getAddress() {
		if (jsonObject == null) { return null; }
		return (JSONObject) jsonObject.get("address");
	}
	
	public String getStreet() {
		if (jsonObject == null) { return null; }
		return (String) getAddress().get("street");
	}
	
	public String getCity() {
		if (jsonObject == null) { return null; }
		return (String) getAddress().get("city");
	}
	
	public String getZip() {
		if (jsonObject == null) { return null; }
		return (String) getAddress().get("zipcode");
	}
	
	public String printEmployee() {
		return "Employee Name: " + getName() + 
				"\nRole: " + getRole() + 
				"\nAddress: " + getStreet() + " " +
					getCity() + ", " + getZip();
	}
	
	// =================================================
	// Test Suite
	// =================================================
	
	@Test
	public void testJsonCanBeParsed() {
		JsonBasicTester jbt = new JsonBasicTester();
		Assert.assertNotEquals(jbt.getObject(), null);
	}
	
	@Test
	public void testParsedContents() {
		JsonBasicTester jbt = new JsonBasicTester();
		Assert.assertEquals(jbt.getName(), "Eric Alsheimer");
		Assert.assertEquals(jbt.getRole(), "Developer");
	}
	
	@Test
	public void testParsedAddress() {
		JsonBasicTester jbt = new JsonBasicTester();
		Assert.assertEquals(jbt.getAddress().get("zipcode"), "22222");
	}
	
	@Test
	public void testPrintEmployee() {
		JsonBasicTester jbt = new JsonBasicTester();
		Assert.assertThat(jbt.printEmployee(), CoreMatchers.containsString("Eric Alsheimer"));
		Assert.assertThat(jbt.printEmployee(), CoreMatchers.containsString("Developer"));
		Assert.assertThat(jbt.printEmployee(), CoreMatchers.containsString("22222"));
	}
	
	// =======================================
	// Main Application
	// =======================================
	
	public static void main(String[] args) {
		JsonBasicTester jbt = new JsonBasicTester();
		System.out.println(jbt.printEmployee());
	}
}