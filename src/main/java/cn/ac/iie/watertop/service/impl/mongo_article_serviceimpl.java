package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.model.mongo_article;
import cn.ac.iie.watertop.service.mongo_article_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by eligcool on 2018/8/8.
 */
@Component
@Repository("mongo_article")
public class mongo_article_serviceimpl  implements mongo_article_service {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void saveUser(mongo_article user) {
        mongoTemplate.save(user);
    }

    @Override
    public String findUserByUserName(String title) {
        Query query=new Query(Criteria.where("source").is(title));
        return  mongoTemplate.findAll(mongo_article.class,"Book").toString();

    }

    @Override
    public void updateUser(mongo_article user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("title", user.getTitle()).set("url", user.getUrl());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,mongo_article.class);
    }

    @Override
    public void deleteUserById(String id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,mongo_article.class);
    }
}
