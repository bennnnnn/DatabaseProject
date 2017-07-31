package dataBaseProject;

import java.util.ArrayList;

public class Application {

	ArrayList <Book> bookList;
	

	public Application(ArrayList<Book> bookList) {
		 
		this.bookList = bookList;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book bookToAdd){
		bookList.add(bookToAdd);
	}
	
 

		

	

}
