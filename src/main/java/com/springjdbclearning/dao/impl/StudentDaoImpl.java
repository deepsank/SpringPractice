package com.springjdbclearning.dao.impl;

import com.springjdbclearning.dao.StudentDao;
import com.springjdbclearning.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

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
}
