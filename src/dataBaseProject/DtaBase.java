package dataBaseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class DtaBase {
 public static void main(String args[]){
	String response;
	 ArrayList<String> booksSku= new  ArrayList<String>();
	 Scanner scan= new Scanner(System.in);
	 Book b = new Book();
	  booksSku.add("Java1001");
	  booksSku.add( "Java1002");
	  booksSku.add( "Oracl1003");
	  booksSku.add( "Python1004");
	  booksSku.add( "Zombie1005");
	  booksSku.add( "Rasp1005");
	 
	  ArrayList<String> booksTitle= new  ArrayList<String>();
	  
	  booksTitle.add("Head First Java");
	  booksTitle.add("Thinking in Java");
	  booksTitle.add("OCP: Oracle Certified Professional Java SE");
	  booksTitle.add("Automate the Boring Stuff with Python");
	  booksTitle.add("The Maker's Guide to the Zombie Apocalypse");
	  booksTitle.add("Raspberry Pi Projects for the Evil Genius");
	  
	  ArrayList<String> booksAuthor= new  ArrayList<String>();
	  booksAuthor.add("Kathy Sierra and Bert Bates");
	  booksAuthor.add("ruce Eckel");
	  booksAuthor.add("Jeanne Boyarsky");
	  booksAuthor.add("Al Sweigart");
	  booksAuthor.add("Simon Monk");
	  booksAuthor.add("Donald Norris");
	  

	  ArrayList<String> booksDiscription= new  ArrayList<String>();
	  booksDiscription.add( "Easy to read Java workbook");
	  booksDiscription.add( "Details about Java under the hood");
	  booksDiscription.add( "Everything you need to know in one place");
	  booksDiscription.add( "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
	  booksDiscription.add( "A dozen fiendishly fun projects for the Raspberry Pi!");
	  

	  ArrayList<Double> booksPrice= new  ArrayList<Double>();
	  booksPrice.add(47.50);
	  booksPrice.add(20.00);
	  booksPrice.add(45.00);
	  booksPrice.add(10.50);
	  booksPrice.add(16.50);
	  booksPrice.add(14.75);
	  
	   
		do{
	  Scanner s = new Scanner(System.in);
	  System.out.println( "Enter book's SKU:");
	  String sku =s.nextLine();
	  b.setSku(sku);
	  int index =booksSku.indexOf(sku);
	  if(booksSku.contains(sku)){
		  System.out.println("THis item is available.\r\r");
		//  for(int i=0;i<booksSku.size();i++)
		  System.out.println("SKU:   \t"+ booksSku.get(index ));
		  System.out.println("Title: \t" +booksTitle.get(index ));
		  System.out.println("Author:\t"+ booksAuthor.get(index ));
		  System.out.println( "Description: \t"+ booksDiscription.get(index ));
		  System.out.println("Price:\t" + booksPrice.get(index ));
		  
	  }
	  else {
	  System.out.println( "Sorry, we dont have that book.");
	  }
	  
	  System.out.println("Do you want to continue search for a book?");
	    
	  response=  scan.nextLine();
		}
		
	   while(response.equalsIgnoreCase( "yes"));
	}

}
 // list of books
// when they benter show them
 