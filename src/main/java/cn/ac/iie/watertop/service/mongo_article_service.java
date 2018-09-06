package cn.ac.iie.watertop.service;

import cn.ac.iie.watertop.model.mongo_article;

/**
 * Created by eligcool on 2018/8/8.
 */
public interface mongo_article_service {
    public void saveUser(mongo_article user);
    public String findUserByUserName(String userName);
    public void updateUser(mongo_article user);
    public void deleteUserById(String id);
}
