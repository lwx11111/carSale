package com.xxx.service;

import com.xxx.dao.PostDao;
import com.xxx.entity.Post;
import com.xxx.entity.vo.MessageModel;

public class PostService {
    private PostDao postDao=new PostDao();
    private MessageModel messageModel=new MessageModel();
    public MessageModel addNewPost(Post p){
        if(!postDao.addNewPost(p)){
            messageModel.setResultMsg("发布失败");
            return messageModel;
        }
        messageModel.setResultMsg("发布成功");
        messageModel.setResultCode(1);
        return messageModel;
    }
}
