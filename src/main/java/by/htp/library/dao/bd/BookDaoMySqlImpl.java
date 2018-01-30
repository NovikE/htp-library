package by.htp.library.dao.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.library.bean.Author;

//import com.mysql.cj.api.jdbc.Statement;


import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class BookDaoMySqlImpl implements BookDao{
	

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
		
		List<Book> list = new ArrayList<>();
		ResourceBundle rb = ResourceBundle.getBundle("db_config");
		String dbURL = rb.getString("db.url");
		String user = rb.getString("db.login");
		String pass = rb.getString("db.pass");
		
		String driver = rb.getString("db.driver.name");
		Connection cn = null;
		
		try {
			
			Class.forName(driver);
			cn = DriverManager.getConnection(dbURL, user, pass);
			System.out.println("connected");
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM books");
			
			Book book = new Book();
			
			while (rs.next()) {
				
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				
				Author author = new Author();
				author.setId(rs.getInt("author"));
				book.setAuthor(author);
				//rs.getInt("author");
				
				rs.getDate("year");
				
				list.add(book);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn!=null) {
					
				cn.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	

}
