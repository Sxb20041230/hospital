package com.oracle.pojo;

//存放登录后的信息
public class SessionIdentity<T> {
    private int tag;
    private T t;
   //登录哪一个身份 通过tag判断 为0则进入管理员列表   为1则进入医生列表
}
