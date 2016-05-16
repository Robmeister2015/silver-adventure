package com.rob.movies;

import org.json.JSONObject;

public class JSONTest {

	public static void main(String[] args){
		JSONObject myjson = new JSONObject("{\"id\":2,\"title\":\"A Movie2\",\"description\":\"A movie about things\",\"director\":\"Senor Spielbergo\",\"country\":\"Mexico2\",\"year\":2009,\"budget\":120.0,\"rentalPrice\":12.5,\"onLoan\":\"y\",\"picture\":\"C:\\Users\\A00226084\\Pictures\\AAA.PNG\"}");
		System.out.println(myjson);
	}
}
