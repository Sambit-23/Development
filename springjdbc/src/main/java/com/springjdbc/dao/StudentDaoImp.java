package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImp implements StudentDao {

//	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
	//insert query
	    String query = "insert into student (id,name,city) values(?,?,?)";
	    int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
	@Override
	public int update(Student student) {
		//update query
		
		String query = "update student set name = ? ,city=? where id=?";
		int update = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return update;
	}
	
	public int delete(int studentId) {
		//delete query
		
		String query ="delete from student where id=?";
		int update = jdbcTemplate.update(query,studentId);
		return update;
	}
	
	public Student getStudent(int studentId) {
		//Select single object
		
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper =new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		// Select multiple object
		String query = "select * from student";
		RowMapper<Student> st = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, st);
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
