package com.xxx.mapper;

import com.xxx.entity.Car;

import java.util.List;

public interface CarMapper {
    public boolean AddNewCar(Car c);
    public List<Car> SelectAllCar();
    public List<Car> SelectMyCar(int uid);
    public boolean deleteCar(int cid);
    public boolean alterCar(int cid);
    public Car selectCar(int cid);
    public List<Car> selectMyPurchase(int uid);
    public boolean insertPurchase(int uid,int cid);
}