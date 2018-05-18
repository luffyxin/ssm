package com.wuit.dao;

import com.wuit.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/5/18.
 */

@Repository
public interface StudentDao {

    List<Student> queryStudent();
}
