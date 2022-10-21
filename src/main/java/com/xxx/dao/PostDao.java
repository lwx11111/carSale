package com.xxx.dao;

import com.xxx.entity.Post;
import com.xxx.mapper.PostMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class PostDao {
    public SqlSession GetSqlSession(){
        InputStream is= UserDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(is);
        SqlSession sqlSession=ssf.openSession();
        return sqlSession;
    }
    public boolean addNewPost(Post p){
        SqlSession sqlSession=GetSqlSession();
        //获取实现接口的代理对象
        PostMapper postMapper=sqlSession.getMapper(PostMapper.class);
        if(!postMapper.addNewPost(p)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }
}
