package com.springjdbc.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App {
  public static void main(String[] args) {
    System.out.println("My Program Started . . .");

    
//    for xml configuration
    
//    ApplicationContext con = new ClassPathXmlApplicationContext("com/springjdbc/demo/springjdbc.xml");

//    for annotation
    
    AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);
    
    StudentDao dao =con.getBean("studentDao",StudentDao.class);

//    INSERT

//    Student student = new Student();
//    student.setId(39);
//    student.setName("Pinky");
//    student.setCity("Balasore");
//    int res = dao.insert(student);
//    System.out.println(res);

//    UPDATE
//
//    Student st = new Student();
//    st.setId(32);
//    st.setName("Durlavi");
//    st.setCity("Bargarh");
//    System.out.println(dao.update(st));

//    DELETE

//    int delete = dao.delete(101);
//    System.out.println(delete+" student deleted successfully");

//    SELECTING SINGLE DATA

//    Student st = dao.getStudent(322);
//    System.out.println(st);

//    SELECTING MULTIPLE DATA

      List<Student> allStudent = dao.getAllStudent();
      for (Student student1 : allStudent) {
		System.out.println(student1);
	}
  }
}
