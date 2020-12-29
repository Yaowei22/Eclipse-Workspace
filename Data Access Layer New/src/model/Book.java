package model;

public class Book {

		long bookId;
		private String isbn13;	
		String bookName;
		String bookDescription;
		
		
		//Getters and Setters
		public long getBookId(String isbn) {
			this.isbn13 = isbn;
			return bookId;
		}
		public void setbookId(long bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookDescription() {
			return bookDescription;
		}
		public void setBookDescription(String bookDescription) {
			this.bookDescription = bookDescription;
		} 
		
		

}
