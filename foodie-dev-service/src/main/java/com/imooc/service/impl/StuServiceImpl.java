package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: hmm
 * @date: 2020/11/6 16:56
 */
@Service
public class StuServiceImpl implements StuService{
    @Autowired
    private StuMapper stuMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveStu() {
        Stu stu = new Stu();
        stu.setName("ddd");
        stu.setAge(11);
        stuMapper.insert(stu);
    }

//    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateStu(int id) {
        Stu stu = new Stu();
        stu.setId(id);
        stu.setName("ddd");
        stu.setAge(11);
        stuMapper.updateByPrimaryKey(stu);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteStu(int id) {
        stuMapper.deleteByPrimaryKey(id);

    }



    public void saveParent() {
        Stu stu = new Stu();
        stu.setName("parent");
        stu.setAge(19);
        stuMapper.insert(stu);
    }

    @Transactional(propagation = Propagation.NESTED)
    public void saveChildren() {
        saveChild1();
        int a=1/0;
        saveChild2();
    }


    public void saveChild1() {
        Stu stu = new Stu();
        stu.setName("child-1");
        stu.setAge(11);
        stuMapper.insert(stu);
    }

    public void saveChild2() {
        Stu stu = new Stu();
        stu.setName("child-2");
        stu.setAge(22);
        stuMapper.insert(stu);
    }
}
