package testCucumber;

import org.testng.annotations.Test;

import javax.xml.transform.stream.StreamSource;

public class TestDefCucum {
    @Test
    void setup(){
        System.out.println("I am inside Setup");
    }
  @Test
    void teststeps(){
     System.out.println("I am inside teststeps");
 }
 @Test
 void teardown(){
     System.out.println("I am inside teardown");

 }
}