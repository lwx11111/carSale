package com.xxx.mapper;

import com.xxx.entity.Car;

import java.util.List;

public interface AttentionMapper {
    public boolean insertAttention(int uid,int cid);
    public List<Car> selectMyAttention(int uid);
    public boolean deleteAttention(int cid);
}
