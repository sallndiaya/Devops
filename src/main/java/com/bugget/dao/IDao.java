package com.bugget.dao;

import java.util.List;

import com.bugget.exceptions.DAOException;

public interface IDao {

	public void save(Object entity) throws DAOException ;
	public void delete(Object entity) throws DAOException ;
	public Object find(Object entityClass, Integer primaryKey) throws DAOException ;
	public List<Object> list(Object entityClass) throws DAOException;
	public List<Object> list(Class<?> entityClass, String whereClause) throws DAOException ;
	public void update(Object entity) throws DAOException;
	public Object find(Class<?> entityClass, String whereClause) throws DAOException ;
	public default Object validateCredential(String login, String password) throws DAOException{return null;};
	
}
