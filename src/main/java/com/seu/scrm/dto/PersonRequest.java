package com.seu.scrm.dto;

/**
 * Created by chenxiaosuo on 2019/3/6.
 * 获取个人统计数据请求实体
 * */
public class PersonRequest {

    /**
     * 用户ID
     * */
    private String userId;

    /**
     * 设计维度
     * */
    private String statisDimens;

    /**
     * 统计的子类别的数量
     * */
    private String subNum;


    @Override
    public String toString() {
        return "PersonRequest{" +
                "userId='" + userId + '\'' +
                ", statisDimens='" + statisDimens + '\'' +
                ", subNum='" + subNum + '\'' +
                '}';
    }
}
