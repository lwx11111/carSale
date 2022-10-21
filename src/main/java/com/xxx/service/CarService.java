package com.xxx.service;

import com.xxx.dao.CarDao;
import com.xxx.entity.Car;
import com.xxx.entity.vo.MessageModel;

import java.util.List;

public class CarService {
    CarDao carDao=new CarDao();
    MessageModel messageModel=new MessageModel();


    /**
     *
     * @param c
     * @return
     */
    public MessageModel AddNewCar(Car c){

        if(!carDao.AddNewCar(c)){
            messageModel.setResultMsg("发布失败");
            return messageModel;
        }
        messageModel.setResultMsg("发布成功");
        messageModel.setResultCode(1);
        return messageModel;

    }

    public List<Car> SelectAllCar(){
        List<Car> list=carDao.SelectAllCar();
        return list;
    }

    public List<Car> selectMyCar(int uid){
        List<Car> list=carDao.selectMyCar(uid);
        return list;
    }

    public MessageModel deleteCar(int cid){
        if(!carDao.delectCar(cid)){
            messageModel.setResultMsg("Database Wrong");
            return messageModel;
        }
        messageModel.setResultMsg("deleteCar Success");
        messageModel.setResultCode(1);
        return messageModel;
    }

    public Car selectCar(int cid){
        Car c=carDao.selectCar(cid);
        return c;
    }

    public MessageModel insertPurchase(int uid,int cid){
        messageModel.setResultMsg("购买成功");
        messageModel.setResultCode(1);
        try {
            carDao.insertPurchase(uid, cid);
        }catch (Exception e){
            messageModel.setResultMsg("已经购买了");
            System.out.println(e);
        }
        return messageModel;
    }

    public List<Car> selectMyPurchase(int uid){
        List<Car> list=carDao.selectMyPurchase(uid);
        return list;
    }

}
