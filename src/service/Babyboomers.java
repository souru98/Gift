package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.Start;
import user.Gifts;

//babyboomers class
public class Babyboomers 
{
  private Gifts gift;
  String selected;
	
  //babyboomers method
public String babyboomers() throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  char choice='n';
	
  //choice option
  if(choice=='n')
   {
	gift = new Gifts();
	ArrayList<String> list = gift.getList();
	
	//gift class call						
	int i=1;
	for(String gift: list)
	 {
	  if(i>=21&&i<31)   //logic expression to access elements
	   { 
		System.out.println(gift);
		System.out.println("YOU LIKED THE GIFT");
		System.out.println("ENTER 'Y' FOR YES AND 'N' FOR NO");
		choice=(char) br.read();
		br.readLine();
		if(choice=='y')    //if user likes the gift
		 {
		   selected=gift;
		   //console output
		   System.out.println(Start.name + ", YOU HAVE CHOOSEN "+selected+" AS YOUR CHOICE OF GIFT");
		   return selected;
		  }
	    }
		 i++;
	 }
	//option to look in the list again
	 System.out.println("SORRY!!! WE WILL UPDATED THE LIST");
     System.out.println("ENTER YES IF YOU WANT TO RE-LOOK INTO LIST");
	  String revisit=br.readLine();
	  if(revisit.equalsIgnoreCase("yes"))
		  babyboomers();
	  else
	  {
		  System.out.println("Thank you");
	  }
  } 
  return null;
}
}

