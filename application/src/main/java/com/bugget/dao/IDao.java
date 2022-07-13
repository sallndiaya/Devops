package com.bugget.dao;

import java.util.List;


public interface IDao {

	public void save(Object entity) ;
	public void delete(Object entity)  ;
	public Object find(Object entityClass, Integer primaryKey)  ;
	public List<Object> list(Object entityClass) ;
	public List<Object> list(Class<?> entityClass, String whereClause)  ;
	
	public void update(Object entity) ;
	public Object find(Class<?> entityClass, String whereClause)  ;
	public Object validateCredential(String login, String password) ;
	
}
