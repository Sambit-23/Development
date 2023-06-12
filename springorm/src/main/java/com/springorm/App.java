package com.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao student = context.getBean("studentDao", StudentDao.class);

//	  Student st = new Student(11, "megha Pattanik", "ghatgaon");
//	  
//	  int insert = student.insert(st);
//	  System.out.println("done :"+insert);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Welcome to My App...");
			System.out.println("=================================================");
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for display all Student");
			System.out.println("Press 3 for get details of a single Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for update Student");
			System.out.println("Press 6 for exit");

			int input;
			try {
				input = Integer.parseInt(br.readLine());
				
				switch (input) {
				case 1:
					System.out.println("Please Add the StudentId");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Please Add the Student Name");
					String name = br.readLine();
					System.out.println("Please Add the Student City");
					String city = br.readLine();
					
					Student st = new Student();
					st.setStudentId(id);
					st.setStudentName(name);
					st.setStudentCity(city);
					
					int r = student.insert(st);
					
					System.out.println(r+" Added Successfully");
					
					break;
				case 2:
					List<Student> allStudent = student.getAllStudent();
					for (Student student2 : allStudent) {
						System.out.println(student2.getStudentId());
						System.out.println(student2.getStudentName());
						System.out.println(student2.getStudentCity());
						System.out.println("__________________________________");
					}
					
					break;
				case 3:
					System.out.println("Please enter the student Id ,You want to Fetch");
					try {
						int sid = Integer.parseInt(br.readLine());
						Student student2 = student.getStudent(sid);
						System.out.println(student2.getStudentId());
						System.out.println(student2.getStudentName());
						System.out.println(student2.getStudentCity());	
						System.out.println("____________________________________");
					} catch (Exception e) {
						System.out.println("no Student Id found");
						System.out.println(e.getMessage());
					}
					
					break;
				case 4:
					int sid = Integer.parseInt(br.readLine());
					student.delete(sid);
					System.out.println("student deleted successfully..");
					break;
				case 5:
					System.out.println("Please Add the StudentId");
					int id1 = Integer.parseInt(br.readLine());
					System.out.println("Please Add the Student new Name");
					String newName = br.readLine();
					System.out.println("Please Add the Student new Name");
					String city1 = br.readLine();
					
					Student st1 = new Student();
					st1.setStudentName(newName);
					st1.setStudentId(id1);
					st1.setStudentCity(city1);
					
					student.update(st1);
					System.out.println("Student with id :"+id1+" updated successfully with name :"+newName);
					break;
				case 6:
					go=false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid input try with another one");
				System.out.println(e.getMessage());
			} 

		}
		System.out.println("Thank You For Using My Application !! ");
	}

}
