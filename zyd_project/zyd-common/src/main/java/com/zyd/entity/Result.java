package com.zyd.entity;

import lombok.Data;

/**
 * @description: 返回结果实体类
 * @author: 喻卫
 * @time: 2020/6/18 23:19
 * @version: 1.0
 **/
@Data
public class Result<T> {

    /**
     * 成功标识
     */
    private boolean flag;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

}