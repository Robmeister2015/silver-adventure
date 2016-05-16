package com.rob.movies;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class MovieWSIT {

	final String GET_ALL_ENTITIES = "http://localhost:8080/MoviesMavenProject/movies";
	final String GET_SINGLE_ENTITY = "http://localhost:8080/MoviesMavenProject/movies/2";
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
	
	@EJB
	MovieDAO movieDao;
	
	@Before
	public void setUp(){
		movieDao = new MovieDAO();
	}
	
	@Deployment
	public static JavaArchive createDeployment() {
		JavaArchive archive = ShrinkWrap.create(JavaArchive.class).addClasses(Movie.class, MovieDAO.class).addAsManifestResource(EmptyAsset.INSTANCE,
				"beans.xml");
		archive.addClass(IntegrationTest.class);
		return archive;
	}

//	@Test
//	public void testGetRequestToGetAllEntities() throws IOException {
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
//		
//		assertEquals(2, 2);
//	}
	
	@Test
	public void testGetSingleEntityOn() throws IOException, JSONException {
		obj = new URL(GET_SINGLE_ENTITY);
		con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod(GET_REQUEST);
		con.setRequestProperty(USER_AGENT, MOZILLA_PROPERTY);
		
		assertEquals(200, con.getResponseCode());
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		
		JSONArray json = new JSONArray("[" + response.toString() + "]");
		Movie movie = movieDao.getMovie(2);
	//	assertEquals(movie.getId(), Integer.parseInt(json.getJSONObject(0).get("id").toString()));
		
}
}
