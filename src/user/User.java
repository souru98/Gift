package user;

//user class
public class User 
{ 
 private String name;
 private String number;
     
 //getter and setter
 public String getName() 
 {
  return name;
 }

 public void setName(String name) 
 {
  this.name = name;
 }

 public String getNumber() 
 {
  return number;
 }

  public void setNumber(String number) 
  {
   this.number = number;
  }
  
     
//constructor
 public User(String name, String number) 
 {
  super();
  this.name = name;
  this.number = number;
 }
}
