package com.wuit.dao;

import com.wuit.BaseTest;
import com.wuit.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/5/18.
 */

public class StudentDaoTest extends BaseTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void queryStudent() throws Exception{
        List<Student> sList=studentDao.queryStudent();
        System.out.println(sList.size());
    }

}
