import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;
import org.hibernate.HibernateException; 

public class ManageEmployeeData {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageEmployeeData EMPDATA = new ManageEmployeeData();
	  /* Add  employee records in  the database  */
	    String firstName, lastName;
	    double salary;
		int moreEmployee =1;
		
		while(moreEmployee!=-1)
		{
			
			firstName=JOptionPane.showInputDialog("please enter employee first name");
			lastName=JOptionPane.showInputDialog("please enter employee last name");
			salary =JOptionPane.showInputDialog("please enter employee Salary");
			int EMPID =EMPDATA.addEmployee(firstName, lastName, salary);
		
		moreEmployee=Integer.parseInt(JOptionPane.showInputDialog("please enter -1 if there are no more Employee"));

	}
	    
      
   }
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, double salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         MasterTaxEmployee employee = new MasterTaxEmployee(fname, lname, salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
   }
 