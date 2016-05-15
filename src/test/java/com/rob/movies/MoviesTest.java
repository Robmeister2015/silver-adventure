package com.rob.movies;

import org.jboss.arquillian.container.test.api.Deployment;
import java.util.Scanner;
import javax.inject.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class MoviesTest {

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class).addClass(Movie.class).addAsManifestResource(EmptyAsset.INSTANCE,
				"beans.xml");
	}

	@Inject
	Movie movie;

	@Test
	public void testGettersAndSetters() {
		movie.setId(12);
		movie.setTitle("Leonardo DiCaprio: A Life In Postage Stamps");
		movie.setDescription("This is a description");
		movie.setDirector("Senor Spielbergo");
		movie.setBudget(12.50);
		movie.setRentalPrice(220);
		movie.setYear(2010);
		movie.setCountry("Ireland");
		movie.setOnLoan("y");
		movie.setPicture("C:/something/something");

	}
}