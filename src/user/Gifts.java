package user;
import java.util.ArrayList;

//gift class
public class Gifts {
	
//arraylist
private ArrayList<String> list;
	
//gift method
public Gifts () 
{
  list = new ArrayList<String>();
	//child list
  list.add("Mermaid Sequin Pillow");
  list.add("Custom Photo Art");
  list.add("Piggy Bank (+money!)");
  list.add("Tee Pee Tent");
  list.add("Stuff ‘n Sit");
  list.add("Clothes");
  list.add("A Watch");
  list.add("Nail Polish");
  list.add("Crayola 140 Count Art Set");
  list.add("Story Books");
	//millennials list
  list.add("Echo Buds");
  list.add("Fujifilm Instax Mini");
  list.add("Beaded Tassel Earrings");
  list.add("Monogram Necklace");
  list.add("Shaving Kit");
  list.add("skateboard");
  list.add("Bracelets");
  list.add("eCoffee Cup");
  list.add("Mademoiselle Perfume");
  list.add("Pop Bed Tent");
	//baby-boomers list
  list.add("photo book");
  list.add("saregama karva");
  list.add("Ancestry DNA Test");
  list.add("Temp-control Mug");
  list.add("Glasses Holder");
  list.add("Warming slipper");
  list.add("E-reader");
  list.add("Holiday tickets");
  list.add("Sweatshirts");
  list.add("car");
}
	
//passing list
public ArrayList<String> getList()
{
 return list;
}

}
