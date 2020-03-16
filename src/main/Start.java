package main;
import java.io.*;
import java.util.ArrayList;

import service.Excelgenerator;
import test.Validation;
import user.Choice;
import user.User;


//class start
public class Start 
{
//initializations
  public static  String name ;
  static User user;

  //main method
public static void main(String[] args) throws IOException
 {
	//detail method calling
   details();
   Choice ch=new Choice();
   ArrayList<String> list=new ArrayList<String>();
    list= ch.choice();
    //calling excel 
   Excelgenerator eg=new Excelgenerator();
   int i=0;
   String gift=null;
   String towhom=null;
   //accessing the list elements
   for(String s :list)
   {
	if(i==0)
	towhom=s;
	else
	gift=s;
	i++;
   }
   
   //cost of the gift
   int cost=(int) (Math.random()*100);
   System.out.println("Cost of your Gift = "+cost+"$");
 System.out.println("THANK YOU!!!");
   eg.excelGenerate(user,towhom , gift,cost); //passing arguments
  } 
	
	//details method
public   static void  details() throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("ENTER YOUR NAME");
 name=br.readLine();
 name=name.toUpperCase();
 System.out.println("ENTER YOUR MOBILE NUMBER");
 String mobile=br.readLine();
 
 //calling validation class 
 Validation validate=new Validation();
 validate.nameValidation(name, mobile);
 user= new User(name,mobile);
// Child c=new Child(name,mobile);
 System.out.println(user.getName());
}
}
		




