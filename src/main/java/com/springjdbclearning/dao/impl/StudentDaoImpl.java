package com.springjdbclearning.dao.impl;

import com.springjdbclearning.dao.RowMapperImpl;
import com.springjdbclearning.dao.StudentDao;
import com.springjdbclearning.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        //insert data
        String query = "insert into student(id,name,city) values (?,?,?)";
        return this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=?, city=? where id=?";
        return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query,studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        /* Selecting single student's data */
        String query = "select * from student where id=?";

        /* Using alternate to above outer class using anonymous class */
//        return (Student) this.jdbcTemplate.queryForObject(query,new RowMapper(){
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student student = new Student();
//                student.setId(rs.getInt(1));
//                student.setName(rs.getString(2));
//                student.setCity(rs.getString(3));
//                return student;
//            }
//        },studentId);

        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(query,rowMapper,studentId);


    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        return this.jdbcTemplate.query(query,new RowMapperImpl());
    }
}
