package com.bugget.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bugget.dao.IDao;


public class HibernateDao implements IDao  {

	public final static Logger logger = LogManager.getLogger(HibernateDao.class);

	private static Session session = null;
	private static Transaction transaction = null;
	private static HibernateDao daoInstance = null;

	protected HibernateDao() {}

	public static HibernateDao getCurrentInstance () {
		if (daoInstance == null) daoInstance = new HibernateDao();
		return daoInstance;
	}
	
	 @Override
	    public void save(Object entity) {
	        try {
	            session = HibernateSession.getSession();
	           
	            //Creating Transaction Object
	            transaction = session.beginTransaction();
	            session.persist(entity);

	            // Transaction Is Committed To Database
	            transaction.commit();
	        } catch (Exception exception) {
	        	exception.printStackTrace();
	        }
	    }
	
	 /* (non-Javadoc)
     *see com.app.sms.dao.IDao#delete(java.lang.Object)
     */
    @Override
    public void delete(Object entity) {
        try {
            session = HibernateSession.getSession();
           
            //Creating Transaction Object
            transaction = session.beginTransaction();
            session.delete(entity);
   
            // Transaction Is Committed To Database
            transaction.commit();
        } catch (Exception exception) {
        }
    }

  
    /* (non-Javadoc)
     *see com.app.sms.dao.IDao#find(java.lang.Class, java.lang.String)
     */
    @Override
    public Object find(Class<?> entityClass, String whereClause)  {
        Object entity = null;
        try {
            session = HibernateSession.getSession();
               
            Query<?> query = session.createQuery("From " + entityClass.getName() + " " + whereClause);
            entity = query.getSingleResult();
           
        } catch (Exception ignored) {}
        return entity;
    }
   
    @SuppressWarnings("unchecked")
    @Override
    public List<Object> list(Class<?> entityClass, String whereClause)  {
        List<Object> entities = null;
        try {
            session = HibernateSession.getSession();
               
            Query<Object> query = session.createQuery("From " + entityClass.getName() + " " + whereClause);
            entities = query.getResultList();
           
        } catch (Exception exception) {
        }
        return entities;
    }
   
    /* (non-Javadoc)
     *see com.app.sms.dao.IDao#list(java.lang.Class)
     */
 

/* (non-Javadoc)
     *see com.app.sms.dao.IDao#update(java.lang.Object)
     */
	@Override
    public void update(Object entity) {
        try {
            session = HibernateSession.getSession();
   
            //Creating Transaction Object  
            transaction = session.beginTransaction();
            session.update(entity);
   
            // Transaction Is Committed To Database
            transaction.commit();
        } catch (Exception exception) {
        }
    }
   
    public static void closeSession() {
        HibernateSession.close();        
    }

	@Override
	public Object find(Object entityClass, Integer primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> list(Object entityClass) {
		List<Object> entities = null;
		try {
			session = HibernateSession.getSession();
		
			
			Query<?> query = session.createQuery("From " + entityClass.getClass().getSimpleName());
			entities = (List<Object>) query.getResultList();
			if (entities != null) logger.info("Records Successfully read.");
			else logger.info("Records not found.");
		} catch (Exception e) {
			//throw new DAOException("ERROR:" + e.getClass() + ":" + e.getMessage());
		}
		return entities;
	}

	@Override
	public Object validateCredential(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}