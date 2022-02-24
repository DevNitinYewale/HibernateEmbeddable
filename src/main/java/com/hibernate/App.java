package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project is started..!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Session session=factory.getCurrentSession();
        
        StudentEntity st=new StudentEntity(102,"ram","ram@123.com");
       /* st.setId(101);
        st.setName("nitin");
        st.setEmail("ni@123.com");*/
        
        Certificate cert=new Certificate("MS-CIT", "3 Months");
        
        st.setCerti(cert);
        
        /*Transaction object is used whenever we perform any operation and based upon that operation there is some change in database.
         *Transaction object is used to give the instruction to the database to make the changes that happen because of operation as a
         * permanent by using commit() method.
         */
        Session s=factory.openSession();
        org.hibernate.Transaction tx=s.beginTransaction();
        
        //object Save:
        s.save(st);
        tx.commit();
        session.close();
        		
    }
}
