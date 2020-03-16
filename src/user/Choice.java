package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import service.Babyboomers;
import service.Child;
import service.Millennials;

//class choice
public class Choice 
{
 public String towhom;

 //choice method
 public ArrayList<String> choice() throws NumberFormatException, IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //user input
  ArrayList<String>  list =new ArrayList<String>();
  String ch="yes";
  while(ch.equalsIgnoreCase("yes")) 
  {
	//choices
   System.out.println("PLEASE SELECT TO WHOM YOU WANT TO GIFT");
   System.out.println(" ENTER 1 FOR CHILDREN");
   System.out.println(" ENTER 2 FOR MILLENNIALS");
   System.out.println(" ENTER 3 FOR BABYBOOMERS");
   int choice =Integer.parseInt(br.readLine());
   
    //switch condition
   switch(choice)
    {
   //child case
    case 1 : 
    Child children=new Child();
    String select= children.child();
    list.add("child");
    list.add(select);
    return list ;
    
    
    //millennials case
	case 2:   
    Millennials millennials= new Millennials();
    towhom="millennials";
    String select1=millennials.millennials();
    list.add("Millennials");
    list.add(select1);
    return list;
    
    
    //babyboomers case
	case 3: 
    Babyboomers babyboomers= new Babyboomers();
    towhom="babyboomers";
    String select2= babyboomers.babyboomers();
    list.add("babyboomers");
    list.add(select2);
    return list;
    
    
   // default case
	default : 
    System.out.println("ENTER THE CORRECT CHOICE");
    choice();
    break;
    }
  }
return list;
}
}
