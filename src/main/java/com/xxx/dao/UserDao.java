package com.xxx.dao;

import com.xxx.entity.User;
import com.xxx.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class UserDao {
    public SqlSession GetSqlSession(){
        InputStream is= UserDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(is);
        SqlSession sqlSession=ssf.openSession();
        return sqlSession;
    }
    /**
     * 通过用户名查询密码，把查询到的用户信息保存在User对象中,返回出去
     * @param uname
     * @return User
     */
    public User login(String uname){
        SqlSession sqlSession=GetSqlSession();
        //获取实现接口的代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User u=userMapper.findByUname(uname);
        sqlSession.close();

        return u;
    }

    /**
     * 判断是否存在用户名
     * @param u
     * @return
     */
    public boolean isHaveUname(User u){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        if(userMapper.isHaveUname(u.getUname())){
            return true;
        }
        return false;
    }

    /**
     * 注册
     * @param u
     * @return
     */
    public boolean register(User u){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        if(!userMapper.addNewUser(u)){
            return false;
        }
        sqlSession.commit();
        return true;
    }

    public boolean uploadUserPic(String picPath,String uname){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        if(!userMapper.uploadUserPic(picPath,uname)){
            return false;
        }
        sqlSession.commit();
        return true;
    }

    public boolean uploadUserNickname(String nickname,String uname){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        if(!userMapper.uploadUserNickname(nickname,uname)){
            return false;
        }
        sqlSession.commit();
        return true;
    }

    public boolean uploadUserProfile(String profile,String uname){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        if(!userMapper.uploadUserProfile(profile,uname)){
            return false;
        }
        sqlSession.commit();
        return true;
    }

    public boolean uploadUserUpwd(String upwd,String uname){
        SqlSession sqlSession=GetSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        if(!userMapper.uploadUserUpwd(upwd,uname)){
            return false;
        }
        sqlSession.commit();
        return true;
    }


}
