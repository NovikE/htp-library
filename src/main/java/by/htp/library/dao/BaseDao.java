package by.htp.library.dao;

import by.htp.library.bean.Entity;

public interface BaseDao <T extends Entity> {
	
	void create(T entity);
	T read(int id);
	void update(T entity);
	void delete(int id);

}
