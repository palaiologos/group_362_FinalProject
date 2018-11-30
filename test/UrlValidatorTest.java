


import junit.framework.TestCase;
import java.util.Random;
//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {
    
   String[] validSchemes = {"http://","https://","ftp://"};
   String[] invalidSchemes = {"4abc"," ", "+-"};
   String[] validAuthority = {"www.google.com","0.0.0.0","OSU.edu"};
   String[] invalidAuthority = {".~google.com","1.2.3",""};
   String[] validPort = {"www.google.com:80","www.google.com:21","www.google.com:443"};
   String[] invalidPort = {"www.google.com:65537","www.google.com:-15",null};
   String[] validPath = { "/path", "/:", "/path/", "/path/path","@"};
   String[] invalidPath = {"//path", "/path//path","./.","'\\'","[]"};
   
   int numberOfRuns = 25;
   
   public static String selectRandom(Random random, String[] array){
       
       String selection = array[random.nextInt(array.length)];
       return selection;
       
   }
   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
//You can use this function to implement your manual testing	   
	   
   }
   
   /*Test Valid Schemes*/
   public void testYourFirstPartition()
   {
       Random rand = new Random();
       UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
       
       for(int i = 0; i < validSchemes.length; i++ ){
           
           System.out.println("\nTesting Valid Schemes: " + validSchemes[i]);
           String currentScheme = validSchemes[i];
           boolean result = false;
           
            try{result= urlVal.isValid(currentScheme);}
        
            catch(Error e) 
    	    {System.out.println(currentScheme+" caused "+e);continue;} //print URL causing errors, the error message then skip it
             System.out.println(currentScheme+" returned "+result); //if a result can be calculated, returned it and URL
      }
           
 
       
       for(int i = 0; i < invalidSchemes.length; i++ ){
           
           System.out.println("\nTesting inValid Schemes: " + invalidSchemes[i]);
           String currentScheme = invalidSchemes[i];
           boolean result = false;
           
            try{result= urlVal.isValid(currentScheme);}
            
            catch(Error e) 
            {System.out.println(currentScheme+" caused "+e);continue;} //print URL causing errors, the error message then skip it
             System.out.println(currentScheme+" returned "+result); //if a result can be calculated, returned it and URL
      }
   }
   
   /*Test Valid and Invalid Authority*/
   public void testYourSecondPartition(){
       
    UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
       
    Random rand = new Random();
    
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentAuthority = selectRandom(rand,validAuthority);
           String currentScheme = selectRandom(rand,validSchemes);
           String combinedURL = currentScheme + currentAuthority;
           
           System.out.println("\nTesting Valid Authority: " + combinedURL);
           
           
           boolean result = false;
           
           try{result= urlVal.isValid(combinedURL);}
            catch(Error e) 
            {System.out.println(combinedURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedURL +" returned "+ result); //if a result can be calculated, returned it and URL
           }
       
       
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentInvAuthority = selectRandom(rand,invalidAuthority);
           String currentInvScheme = selectRandom(rand,invalidSchemes);
           String combinedInvURL = currentInvScheme + currentInvAuthority;
           boolean result = false;
           
           System.out.println("\nTesting invalid Authority: " + combinedInvURL);
           
           try{result= urlVal.isValid(combinedInvURL);}
            catch(Error e) 
            {System.out.println(combinedInvURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedInvURL +" returned "+ result); //if a result can be calculated, returned it and URL
           }
           
   }
   
   /*Test Valid and Invalid Ports*/
   public void testYourThirdPartition(){
       
    UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
    
    Random rand = new Random();
       
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentScheme = selectRandom(rand,validSchemes);
           String currentPort = selectRandom(rand,validPort);
           String combinedURL = currentScheme + currentPort;
           
           System.out.println("\nTesting Valid Port: " + combinedURL);
           boolean result = false;
           
           try{result= urlVal.isValid(combinedURL);}
            catch(Error e) 
            {System.out.println(combinedURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedURL +" returned "+ result); //if a result can be calculated, returned it and URL          
        }
       
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentInvScheme = selectRandom(rand,invalidSchemes);
           String currentInvPort = selectRandom(rand,invalidPort);
           String combinedInvURL = currentInvScheme + currentInvPort;
           
           System.out.println("\nTesting invalid Port: " + combinedInvURL);
           
           boolean result = false;
           
           try{result= urlVal.isValid(combinedInvURL);}
            catch(Error e) 
            {System.out.println(combinedInvURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedInvURL +" returned "+ result); //if a result can be calculated, returned it and URL
        }
   }
   
   public void testYourFifthPartition(){
       
    UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
    
    Random rand = new Random();
       
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentScheme = selectRandom(rand,validSchemes);
           String currentPort = selectRandom(rand,validPort);
           String currentPath = selectRandom(rand,validPath);
           String combinedURL = currentScheme + currentPort + currentPath;
           
           System.out.println("\nTesting Valid Path: " + combinedURL);
           boolean result = false;
           
           try{result= urlVal.isValid(combinedURL);}
            catch(Error e) 
            {System.out.println(combinedURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedURL +" returned "+ result); //if a result can be calculated, returned it and URL          
        }
       
       for(int i = 0; i < numberOfRuns; i++ ){
           
           String currentInvScheme = selectRandom(rand,invalidSchemes);
           String currentInvPort = selectRandom(rand,invalidPort);
           String currentInvPath = selectRandom(rand,invalidPath);
           String combinedInvURL = currentInvScheme + currentInvPort + currentInvPath;
           
           System.out.println("\nTesting invalid Path: " + combinedInvURL);
           
           boolean result = false;
           
           try{result= urlVal.isValid(combinedInvURL);}
            catch(Error e) 
            {System.out.println(combinedInvURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(combinedInvURL +" returned "+ result); //if a result can be calculated, returned it and URL
        }
   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
     

   }
   


 }
