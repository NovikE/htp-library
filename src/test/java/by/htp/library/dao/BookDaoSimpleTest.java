package by.htp.library.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.htp.library.dao.simple.SimpleBookDaoImpl;


public class BookDaoSimpleTest {
	
	 private BookDao dao = null;
		
		@Before
		public void initData() {
			
			dao = new SimpleBookDaoImpl();
			
		}
		
		@Test
		public void testReadAllListNotNull() {
			Assert.assertNotNull(dao);
			Assert.assertNotNull(dao.readAll());
			
			
		}
	}


