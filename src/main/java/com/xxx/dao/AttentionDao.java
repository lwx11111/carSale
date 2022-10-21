package com.xxx.dao;

import com.xxx.entity.Car;
import com.xxx.mapper.AttentionMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class AttentionDao {
    public SqlSession GetSqlSession(){
        InputStream is= UserDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(is);
        SqlSession sqlSession=ssf.openSession();
        return sqlSession;
    }

    public boolean insertAttention(int uid,int cid){
        SqlSession sqlSession=GetSqlSession();
        AttentionMapper attentionMapper=sqlSession.getMapper(AttentionMapper.class);
        if(!attentionMapper.insertAttention(uid,cid)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }

    public List<Car> selectMyAttention(int uid){
        SqlSession sqlSession=GetSqlSession();
        AttentionMapper attentionMapper=sqlSession.getMapper(AttentionMapper.class);
        List<Car> list=attentionMapper.selectMyAttention(uid);
        return  list;
    }

    public boolean deleteAttention(int cid){
        SqlSession sqlSession=GetSqlSession();
        AttentionMapper attentionMapper=sqlSession.getMapper(AttentionMapper.class);
        if(!attentionMapper.deleteAttention(cid)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }
}
