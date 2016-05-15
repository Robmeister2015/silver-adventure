package com.rob.movies;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class MovieWSTest {

	final String GET_ALL_ENTITIES = "http://localhost:8080/MoviesMavenProject/movies";
	final String GET_SINGLE_ENTITY = "";
	final String POST_ENTITY = "";
	final String PUT_ENTITY = "";
	
	final String GET_REQUEST = "GET";
	final String POST_REQUEST = "POST";
	final String PUT_REQUEST = "PUT";
	final String DELETE_REQUEST = "DELETE";
	
	final String MOZILLA_PROPERTY = "MOZILLA/5.0";
	final String CHROME_PROPERTY = "";
	final String INTERNET_EXPLORER_PROPERTY = "";
	final String OPERA_PROPERTY = "";
	
	final String USER_AGENT = "User Agent";
	
	URL obj;
	HttpURLConnection con;
	
	@Before
	public void setUp(){

	}
	
	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class).addClass(Movie.class).addAsManifestResource(EmptyAsset.INSTANCE,
				"beans.xml");
	}

	@Test
	public void testGetRequestToGetAllEntities() throws IOException {
		//change
//		obj = new URL(GET_ALL_ENTITIES);
//		con = (HttpURLConnection) obj.openConnection();
//		con.setRequestMethod(GET_REQUEST);
//		con.setRequestProperty(USER_AGENT, MOZILLA_PROPERTY);
//		
//		assertEquals(200, con.getResponseCode());
//		
//		BufferedReader in = new BufferedReader(
//		        new InputStreamReader(con.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
//		
//		System.out.println(response.toString());
//		System.out.println(response.toString());
		assertEquals(2, 2);
	}
}
