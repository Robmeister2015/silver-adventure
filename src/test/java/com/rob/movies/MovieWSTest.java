package com.rob.movies;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

@SuppressWarnings("deprecation")
@RunWith(Arquillian.class)
public class MovieWSTest { 

	private static final String REST_PATH = "/";
    // testable = false here means all the tests are running outside of the container
    @Deployment(testable = false) 
    public static WebArchive createTestArchive() {
        return ShrinkWrap.create(WebArchive.class, "test.war").addClass(Movie.class);
        // Adding omitted                                
        //.addClasses(....)                 
    }   

    @Test
    public void testGetCustomerByIdUsingClientRequest() throws Exception {
        URL deploymentUrl = new URL("http://localhost:8080/MoviesMavenProject");
        // GET http://localhost:8080/test/rest/customer/1
        ClientRequest request = new ClientRequest(deploymentUrl.toString() + "/movies");
        request.header("Accept", MediaType.APPLICATION_JSON);

        // we're expecting a String back
        ClientResponse<String> responseObj = request.get(String.class);

        Assert.assertEquals(200, responseObj.getStatus());
        System.out.println("GET /customer/1 HTTP/1.1\n\n" + responseObj.getEntity());

    }
}