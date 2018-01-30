package by.htp.library.action.console;

import java.io.PrintWriter;
import java.util.List;

import by.htp.library.action.BaseAction;
import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.bd.BookDaoMySqlImpl;
import by.htp.library.dao.simple.SimpleBookDaoImpl;

public class BookListConsoleImpl implements BaseAction {

	// private BookDao dao = new SimpleBookDaoImpl();
	private BookDao dao = new BookDaoMySqlImpl();

	@Override
	public void doSmth(PrintWriter out) {

		List<Book> books = dao.readAll();

		if (books != null) {
			for (Book book : books) {

				out.println(book);
			}
		} else {
			out.println("Empty library!");
		}

	}

}
