package com.springorm.dao;

import com.springorm.entity.Person;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class PersonDao {

    private HibernateTemplate hibernateTemplate;

    public int insert(Person person){
        Integer res = (Integer) this.hibernateTemplate.save(person);
        return res;
    }

    public PersonDao() {
    }

    public PersonDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
