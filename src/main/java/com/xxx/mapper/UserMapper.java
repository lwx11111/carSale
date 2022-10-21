package com.xxx.mapper;

import com.xxx.entity.User;

public interface UserMapper {
    public User findByUname(String uname);
    public boolean addNewUser(User u);
    public boolean isHaveUname(String uname);
    public boolean uploadUserPic(String picPath,String uname);
    public boolean uploadUserNickname(String nickname,String uname);
    public boolean uploadUserProfile(String profile,String uname);
    public boolean uploadUserUpwd(String upwd,String uname);
}
