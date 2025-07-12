package com.springjdbclearning.dao;

import com.springjdbclearning.entity.Student;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
}
