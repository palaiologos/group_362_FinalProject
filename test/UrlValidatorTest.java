


import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {
    
   String[] validSchemes = {"http://","https://","ftp://"};
   String[] invalidSchemes = {"4abc"," ", "+-"};
   String[] validAuthority = {"www.google.com","0.0.0.0","OSU.edu"};
   String[] invalidAuthority = {".~google.com","1.2.3",""};
   String[] validPort = {"www.google.com:80","www.google.com:21","www.google.com:443"};
   String[] invalidPort = {"www.google.com:65537","www.google.com:-15",""};

   
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
   
   
   public void testYourFirstPartition()
   {
       
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
   
   public void testYourSecondPartition(){
       
    UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
       
       for(int i = 0; i < validAuthority.length; i++ ){
           
           System.out.println("\nTesting Valid Authority: " + validAuthority[i]);
           String currentAuthority = validAuthority[i];
           String currentScheme = validSchemes[i];
           
           boolean result = false
           
           try{result= urlVal.isValid(currentScheme + currentAuthority);}
            catch(Error e) 
            {System.out.println(currentAuthority +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(currentAuthority +" returned "+ result); //if a result can be calculated, returned it and URL
           }
       
       
       for(int i = 0; i < invalidAuthority.length; i++ ){
           
           System.out.println("\nTesting inValid Authority: " + invalidAuthority[i]);
           String invAuthority = invalidAuthority[i];
           String currentInvScheme = invalidSchemes[i];
           boolean result = false;
           
           try{result= urlVal.isValid(currentInvScheme + invAuthority);}
            catch(Error e) 
            {System.out.println(invAuthority +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(invAuthority +" returned "+ result); //if a result can be calculated, returned it and URL
           }
           
   }
   public void testYourThirdPartition(){
       
    UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
       
       for(int i = 0; i < validPort.length; i++ ){
           
           System.out.println("\nTesting Valid Port: " + validPort[i]);
           
           String currentScheme = validSchemes[i];
           String vPort = validPort[i];
           String URL = currentScheme + vPort;
           boolean result = false;
           
           try{result= urlVal.isValid(URL);}
            catch(Error e) 
            {System.out.println(URL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(URL +" returned "+ result); //if a result can be calculated, returned it and URL          
        }
       
       for(int i = 0; i < invalidPort.length; i++ ){
           
           System.out.println("\nTesting inValid Port: " + invalidPort[i]);
           
           String invCurrentScheme = invalidSchemes[i];
           String invCurrentAuthority = invalidAuthority[i];
           String invPort = invalidPort[i];
           String invURL = invCurrentScheme + invCurrentAuthority + invPort;
           
           boolean result = false;
           
           try{result= urlVal.isValid(invURL);}
            catch(Error e) 
            {System.out.println(invURL +" caused " +e); continue;} //print URL causing errors, the error message then skip it
             System.out.println(invURL +" returned "+ result); //if a result can be calculated, returned it and URL
        }
   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
     

   }
   


 }
