package com.xxx.service;

import com.xxx.dao.AttentionDao;
import com.xxx.entity.vo.MessageModel;

import java.io.IOException;

public class AttentionService {
    private AttentionDao attentionDao=new AttentionDao();
    private MessageModel messageModel=new MessageModel();

    public MessageModel insertAttention(int uid,int cid){
        messageModel.setResultMsg("关注成功");
        messageModel.setResultCode(1);
        try {
            attentionDao.insertAttention(uid, cid);
        }catch (Exception e){
            messageModel.setResultMsg("已经关注了");
            System.out.println(e);
        }
        return messageModel;
    }

    public MessageModel deleteAttention(int cid){
        if(!attentionDao.deleteAttention(cid)){
            messageModel.setResultMsg("Database Wrong");
            return messageModel;
        }
        messageModel.setResultCode(1);
        messageModel.setResultMsg("deleteAttention Success");
        return messageModel;
    }
}
