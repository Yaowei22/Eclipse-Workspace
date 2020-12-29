package book;

import java.util.List;

import model.Book;

public interface bookDAO {
	List<Book> getTags();
	void addBookTag(Book ISBN13);
	void deleteBookTag(Book ISBN13);
	List<Book> getBooks();

}
