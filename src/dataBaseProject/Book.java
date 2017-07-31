package dataBaseProject;

/**
 * 
 * @author Binalfew
 *
 */
public class Book {

		
		private String sku;
		private String title;
		private String author;
		private String  discription;
		private double price;
		
		
		 
		
		public Book(String sku, String title, String author, String discription, double price) {
			
			this.sku = sku;
			this.title = title;
			this.author = author;
			this.discription = discription;
			this.price = price;
		}
	
		public String getSku() {
			return sku;
		}
	
		public void setSku(String sku) {
			this.sku = sku;
		}
	
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String getAuthor() {
			return author;
		}
	
		public void setAuthor(String author) {
			this.author = author;
		}
	
		public String getDesciription() {
			return discription;
		}
	
		public void setDesciription(String desciription) {
			this.discription = desciription;
		}
	
		public double getPrice() {
			return price;
		}
	
		public void setPrice(double price) {
			this.price = price;
		}
	
		
		
		
	
	}
