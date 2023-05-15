package hibernate.practice.hibernate.ak;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//    	 Employee emp1 = new Employee();
//         emp1.setEmpId(103);
//         emp1.setEmpName("Karthik");
//         emp1.setEmpCountry("England");
    	Employee emp1 = null;
         
         Configuration conf = new Configuration().configure().addAnnotatedClass(Employee.class); 
 		SessionFactory factory = conf.buildSessionFactory();
 		
 		Session session = factory.openSession();
 		Transaction trans = session.beginTransaction();
 		
 		 emp1 = session.get(Employee.class, 101);
         System.out.println(emp1.getEmpName());
//         
         session.close();
         
         
         Session session1 = factory.openSession();
          session1.beginTransaction();
          emp1 = session1.get(Employee.class, 102);
         System.out.println(emp1.getEmpName());
         session1.close();
 		
// 		session.save(emp1);
// 		trans.commit();
 		
// 		emp2 = session.get(Employee.class, 101);
// 		System.out.println(emp2);
// 		
// 		for(int i=0;i<30;i++) { Employee e1 = new Employee();e1.setEmpId(i);
// 		
//		 e1.setEmpName("Rahul "+i); EmployeeName en = new EmployeeName();
//		  en.setFname("fName " +i); en.setLname("lName "+i); e1.setEmpName(en);
//		 session.save(e1);
 		}
    }

