package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.Start;
import user.Gifts;

//class millenials
public class Millennials 
 {
   private Gifts gift;
   String selected;
		
	//method millenials	
public String millennials() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char choice='n';

//choice option
if(choice=='n')
 {
  gift = new Gifts();
  ArrayList<String> list = gift.getList();
  
	//calling gift class			
  int i=1;
  for(String gift: list)
   { 
	if(i>=11&&i<21)   //logic checking for accessing list
	 { 
	  System.out.println(gift);
	  System.out.println("YOU LIKED THE GIFT");
	  System.out.println("ENTER 'Y' FOR YES AND 'N' FOR NO");
	  choice=(char) br.read();
	  br.readLine();
	  if(choice=='y')    //if user likes gift
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
	  millennials();
     else
     {
	  System.out.println("Thank you");
     }
  }
return null;
}  
}
