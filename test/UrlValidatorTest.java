


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
	   UrlValidator url = new UrlValidator();
	   UrlValidator url_scheme = new UrlValidator(null,null, UrlValidator.ALLOW_ALL_SCHEMES);
	
//*******************************************************************************
//   Without an ALLOW_ALL_SCHEME	 
//*******************************************************************************
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   String message = "http://www.google.com";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "http://";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "https://";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "ftp://";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "google.com";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "youtube.com";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "0.0.0.0";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Without an ALLOW_ALL_SCHEME");
	   message = "255.255.255.255";
	   if (url.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }

//*******************************************************************************
//   With an ALLOW_ALL_SCHEME	 
//*******************************************************************************	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   
	   message = "http://";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "3ht://";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "3ht://";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://google.com";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://youtube.com";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://0.0.0.0";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://aaa.";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://1.2.3.4.5";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://.aaa";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   message = "http://go.a";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
//*******************************************************************************
//   With certain schemes passed such as http and  https 
//*******************************************************************************
	   System.out.println("\n");
	   System.out.println("With certain schemes passed such as http and https");
	   String [] schemes = {"http", "https"};
	   UrlValidator url_s = new UrlValidator(schemes);
	  
	   message = "http://";
	   if (url_s.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With certain schemes passed such as http and https");
	   message = "https://";
	   if (url_s.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With certain schemes passed such as http and https");
	   message = "ftp://";
	   if (url_s.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With certain schemes passed such as http and https");
	   message = "3ht://";
	   if (url_s.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("With certain schemes passed such as http and https");
	   message = "http://";
	   if (url_s.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
//*******************************************************************************
//   With an ALLOW_ALL_SCHEME	 
//*******************************************************************************
	   System.out.println("\n");
	   System.out.println("With an ALLOW_ALL_SCHEME");
	   System.out.println("Adding port 80 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com:80";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding port -1 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com:-1";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding port 65535 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com:65535";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	
	   System.out.println("\n");
	   System.out.println("Adding port 0 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com:0";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding port 65536 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com:65536";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /test1 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/test1";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /t123 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/t123";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /$23 to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/$23";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   
	   System.out.println("\n");
	   System.out.println("Adding path /$# to the url with ALLOW_ALL_SCHEME"); 
	   message = "http://google.com/$#";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /$#/file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/$#/file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /$#//file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/$#//file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /$23/file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/$23/file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /../ to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/../";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /.. to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/..";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /test1/file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/test1/file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /test1//file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/test1//file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /test1/ to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/test1/";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding path /t123/file to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com/t123/file";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding query ?action=view to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com?action=view";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding query ?action=edit&mode=up to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com?action=edit&mode=up";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding query ?name=ferret to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com?name=ferret";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding query ?name=ferret&color=purple to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com?name=ferret&color=purple";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }
	   
	   System.out.println("\n");
	   System.out.println("Adding query ?# to the url with ALLOW_ALL_SCHEME");
	   message = "http://google.com?#";
	   if (url_scheme.isValid(message)) {
		    System.out.println(message);
		   	System.out.println("Url is valid");
	   }else {
		   System.out.println(message);
		   System.out.println("Url is not valid");
	   }	   
	   
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
