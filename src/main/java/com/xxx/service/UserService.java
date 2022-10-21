package com.xxx.service;

import com.xxx.dao.UserDao;
import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;
import com.xxx.util.StringUtil;

public class UserService {
    private MessageModel messageModel=new MessageModel();
    private UserDao userDao=new UserDao();
    private StringUtil stringUtil=new StringUtil();
    private User u=new User();
    /**
     * 判断用户登录是否成功
     *      1.非空判断
     *      2.是否存在用户
     *      3.通过Dao层判断密码
     * @param uname
     * @param upwd
     * @return
     */
    public MessageModel UserLogin(String uname,String upwd){
        //非空判断
        if(stringUtil.isEmpty(uname)||stringUtil.isEmpty(upwd)){
            messageModel.setResultMsg("用户名或密码为空");
            return messageModel;
        }

        u=userDao.login(uname);
        //是否存在用户
        if(u==null){
            messageModel.setResultMsg("用户不存在");
            return messageModel;
        }
        //密码判断
        if(!u.getUpwd().equals(upwd)){
          messageModel.setResultMsg("用户名或密码错误");
          return messageModel;
        }
        //类型判断

        messageModel.setResultCode(1);
        messageModel.setResultMsg("success");
        return messageModel;
    }

    /**
     * 获取登录成功后的user对象并且返回给Servlet
     * @return
     */
    public User getUser(){
        return u;
    }
    /**
     * 注册
     * @param u
     * @return
     */
    public MessageModel UserRegister(User u){
        String uname=u.getUname();
        String upwd=u.getUpwd();
        String nickname=u.getNickname();
        String profile=u.getProfile();
        String picPath=u.getPicPath();

        //1.非空判断
        if(stringUtil.isEmpty(uname)||stringUtil.isEmpty(upwd)){
            messageModel.setResultMsg("用户名或密码为空");
            return messageModel;
        }
        //2.用户名是否存在
        if(userDao.isHaveUname(u)){
            messageModel.setResultMsg("用户名已存在");
            return messageModel;
        }
        /**
         * 默认nickname profile picPath
         */
        if(stringUtil.isEmpty(nickname)){
            u.setNickname("nickname");
        }

        if(stringUtil.isEmpty(profile)){
            u.setProfile("说点什么");
        }

        if(stringUtil.isEmpty(picPath)){
            u.setPicPath("./userpic/default.png");

        }

        //3.注册
        if(!userDao.register(u)){
            messageModel.setResultMsg("注册失败,请联系管理员");
            return messageModel;
        }
        messageModel.setResultMsg("register success");
        messageModel.setResultCode(1);
        return messageModel;
    }

    /**
     * 更新头像
     * @param picPath
     * @param uname
     * @return
     */
    public MessageModel uploadUserPic(String picPath,String uname){
        if(!userDao.uploadUserPic(picPath, uname)){
            messageModel.setResultMsg("upLoad wrong");
            return messageModel;
        }
        messageModel.setResultCode(1);
        messageModel.setResultMsg("success");

        return messageModel;
    }

    /**
     * 更新nickname和profile
     *
     * @param nickname
     * @param profile
     * @return
     */
    public boolean uploadUserInfo(String nickname,String profile,String uname){
        if(!stringUtil.isEmpty(nickname)){
            if(!userDao.uploadUserNickname(nickname,uname)){
                return false;
            }
        }
        if(!stringUtil.isEmpty(profile)){
            if(!userDao.uploadUserProfile(profile, uname)){
                return false;
            }
        }

        return true;
    }

    public boolean uploadUserUpwd(String upwd,String uname){
        if(!stringUtil.isEmpty(upwd)){
            if(!userDao.uploadUserUpwd(upwd,uname)){
                return false;
            }
        }
        return true;
    }
}
