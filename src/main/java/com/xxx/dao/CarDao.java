package com.xxx.dao;

import com.xxx.entity.Car;

import com.xxx.mapper.CarMapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CarDao {
    public SqlSession GetSqlSession(){
        InputStream is= UserDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(is);
        SqlSession sqlSession=ssf.openSession();
        return sqlSession;
    }
    public boolean AddNewCar(Car c){
        SqlSession sqlSession=GetSqlSession();
        //获取实现接口的代理对象
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        if(!carMapper.AddNewCar(c)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }

    public List<Car> SelectAllCar(){
        List<Car> list=new ArrayList<Car>();
        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        list=carMapper.SelectAllCar();

        return list;
    }

    public List<Car> selectMyCar(int uid){

        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        List<Car> list=carMapper.SelectMyCar(uid);
        return list;
    }

    public boolean delectCar(int cid){
        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        if(!carMapper.deleteCar(cid)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }

    public Car selectCar(int cid){
        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        Car c=carMapper.selectCar(cid);
        return c;
    }

    public List<Car> selectMyPurchase(int uid){

        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        List<Car> list=carMapper.selectMyPurchase(uid);
        return list;
    }

    public boolean insertPurchase(int uid,int cid){
        SqlSession sqlSession=GetSqlSession();
        CarMapper carMapper=sqlSession.getMapper(CarMapper.class);
        if(!carMapper.insertPurchase(uid,cid)){
            return false;
        }
        sqlSession.commit();
        sqlSession.close();
        return true;
    }
}
