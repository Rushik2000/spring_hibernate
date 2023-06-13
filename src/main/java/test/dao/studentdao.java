package test.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import test.bean.student;

@Repository
@Transactional
public class studentdao {
	
	@Autowired                      // for connection to controller file
	private SessionFactory sess;
	
	public void insert(student s)
	{
		sess.getCurrentSession().save(s);
	}
	
	@SuppressWarnings("unchecked")
	public List<student> getallstudents()
	{
		return sess.getCurrentSession().createQuery("FROM student").list();
	}
	
	public void deletestudent(int id)
	{
		student s=(student) sess.getCurrentSession().load(student.class,id);
		
		this.sess.getCurrentSession().delete(s);
	}
	
	public student getstudent(int id)
	{
		return (student) sess.getCurrentSession().get(student.class, id);
	}
	
	public void updatestudent(student s)    // s is old object 
	{
		student stud=new student();       //new object of student
		
		stud=(student) sess.getCurrentSession().get(student.class, s.getId());      //with the help of getId we get all parameters
		
		stud.setFname(s.getFname());                 // first set fname in new object(stud) and then get values in old object(s)
		stud.setLname(s.getLname());
		stud.setEmail(s.getEmail());
		stud.setPassword(s.getPassword());
		
		sess.getCurrentSession().update(stud);
		
	}
	

}
