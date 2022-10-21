package com.xxx.test;

import com.xxx.entity.User;
import com.xxx.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test {
    public static void main(String[] args) {
        InputStream is= test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(is);
        SqlSession sqlSession=ssf.openSession();
        //获取实现接口的代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        User u=userMapper.findByUname("admin");
//        System.out.println(u.getId());
//        System.out.println(u.getUname());
//         System.out.println(u.getUpwd());

        /**
         * 1.数据库开启id自增
         * 2.mapper.xml加入属性useGeneratedKeys="true" keyProperty="id"可以通过getId获取id值
         */
        User u=new User();
        u.setUname("testname");
        u.setUpwd("testpwd");

        System.out.println(userMapper.addNewUser(u));
        //如果开启事务没有commit是不会插到数据库
        sqlSession.commit();
        System.out.println(u.getUid());
        sqlSession.close();
    }
}
