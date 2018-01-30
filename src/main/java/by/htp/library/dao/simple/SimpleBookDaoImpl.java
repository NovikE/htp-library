package by.htp.library.dao.simple;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class SimpleBookDaoImpl implements BookDao{

	@Override
	public void create(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> readAll() {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(1, "Book1", null));
		books.add(new Book(2, "Book2", null));
		books.add(new Book(3, "Book3", null));
		
		return books;
	}

}
