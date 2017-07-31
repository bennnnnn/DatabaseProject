package dataBaseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class DtaBase {
	
 public static void main(String args[]){
	  String response;

	 ArrayList<Book> allBooks= new  ArrayList<Book>();
	 

	 Book book1 = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.5);
	 Book book2 = new Book("Java1002", "Thinking in Java", " ruce Eckel", "Details about Java under the hood", 20.0);
	 Book book3 = new Book("Oracl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.0);
	 Book book4 = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 47.5);
	 Book book5 = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Easy to read Java workbook", 10);
	 Book book6 = new Book("Rasp1005", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 16);
	 

	  allBooks.add(book1);
	  
	  allBooks.add(book2);
	  
	  allBooks.add(book3);
	  
	  allBooks.add(book4);
	  
	  allBooks.add(book5);
	  
	  allBooks.add(book6);









	 Scanner scan = new Scanner(System.in);

	   
	  
	   
		do{

	  System.out.println( "Enter book's SKU to search a book::");
	  String input =scan.nextLine();

	  if(input.equalsIgnoreCase(book1.getSku())){
		  System.out.println("This item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book1.getSku());
		  System.out.println("Title: \t" +book1.getTitle());
		  System.out.println("Author:\t"+ book1.getAuthor());
		  System.out.println("Description: \t"+book1.getDesciription());
		  System.out.println("Price:\t" + book1.getPrice());
		  
	  }
	  else if(input.equalsIgnoreCase(book2.getSku()) ){
		  System.out.println("This item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book2.getSku());
		  System.out.println("Title: \t" +book2.getTitle());
		  System.out.println("Author:\t"+ book2.getAuthor());
		  System.out.println( "Description: \t"+book2.getDesciription());
		  System.out.println("Price:\t" + book1.getPrice());
		  
	  }
	  else if(input.equalsIgnoreCase(book3.getSku())){
		  System.out.println("THis item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book3.getSku());
		  System.out.println("Title: \t" +book3.getTitle());
		  System.out.println("Author:\t"+ book3.getAuthor());
		  System.out.println( "Description: \t"+book3.getDesciription());
		  System.out.println("Price:\t" + book3.getPrice());
		  
	  }
	  else if(input.equalsIgnoreCase(book4.getSku())){
		  System.out.println("THis item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book4.getSku());
		  System.out.println("Title: \t" +book4.getTitle());
		  System.out.println("Author:\t"+ book4.getAuthor());
		  System.out.println( "Description: \t"+book4.getDesciription());
		  System.out.println("Price:\t" + book4.getPrice());
		  
	  }
	  else if(input.equalsIgnoreCase(book5.getSku())){
		  System.out.println("THis item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book5.getSku());
		  System.out.println("Title: \t" +book5.getTitle());
		  System.out.println("Author:\t"+ book5.getAuthor());
		  System.out.println( "Description: \t"+book5.getPrice());
		  
	  }
	  else if(input.equalsIgnoreCase(book6.getSku())){
		  System.out.println("THis item is available.\r\r");
		 
		  System.out.println("SKU:   \t"+ book6.getSku());
		  System.out.println("Title: \t" +book6.getTitle());
		  System.out.println("Author:\t"+ book6.getAuthor());
		  System.out.println( "Description: \t"+book6.getDesciription());
		  System.out.println("Price:\t" + book6.getPrice());
		  
	  }
	  else {
	  System.out.println( "Sorry, we dont have that book.");
	  }
	  
	  System.out.println("Do you want to continue search for a book?");
	    
	  response=  scan.nextLine();
		}
		
	   while((response.equalsIgnoreCase( "yes")));

	
    System.out.println("Bye");
 }

}
