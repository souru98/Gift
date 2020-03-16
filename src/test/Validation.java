package test;

import java.io.IOException;

import main.Start;

//validation class
public class Validation
{
 public boolean nameValidation(String name,String mobile) throws IOException
  {
	//array of string 
   String a[]= {"ass","anal","anal impaler","anal leakage","analprobe","booger","bookie","boong","booobs","boooobs","c-0-c-k","c0cksucker","caca","cacafuego","cahone","camel toe","cameltoe","camgirl","camslut","camwhore","ass fuck"," ass hole","suckass","sucked","sucking","sucks","suicide girls","sultry women"};
   for(int i=0;i<25;i++)
    {
	 if(name.equalsIgnoreCase(a[i]))
	 {
	  System.out.println("NO BAD WORDS PLEASE");
	  Start.details();   //calling details method
	 }
	}

    mobileValidation(mobile);  //calling mobilevalidation method
    return true;
   }
	
 //mobile validation method
public boolean  mobileValidation(String mobile) throws IOException
 {
  String regex = "(0/91)?[7-9][0-9]{9}";
  //validation using regex
  if(mobile.matches(regex)==false)  
   {
	System.out.println("YOU SHARED THE FALSE DETAIL   THANK YOU!!!");
	Start.details();
   }
	return true;
  }

}
