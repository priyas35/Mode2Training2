package com.mortgage;


import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {


    @LocalServerPort
    int randomServerPort;
   
    @Test
    public void testGetUserSuccess() throws URISyntaxException
    {
        RestTemplate restTemplate = new RestTemplate();
       
        final String baseUrl = "http://localhost:"+randomServerPort+"/user/Priya/get";
        URI uri = new URI(baseUrl);
       
        //Verify request succeed
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        System.out.println(result.getStatusCodeValue());
             Assert.assertEquals(200, result.getStatusCodeValue());
             

        }
        
        
       
       
            
    @Test
    public void testGetUserFailure() throws URISyntaxException
    {
        RestTemplate restTemplate = new RestTemplate();
       
        final String baseUrl = "http://localhost:"+randomServerPort+"/user/sss/get";
        URI uri = new URI(baseUrl);
       
    
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
      
             Assert.assertEquals(200, result.getStatusCodeValue());
            

        }
       
       
            }
 

   





