package cn.ac.iie.watertop;


import cn.ac.iie.watertop.model.mongo_article;
import cn.ac.iie.watertop.service.mongo_article_service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback
public abstract class Tester {


    @Autowired
    private mongo_article_service userDao;

    @Test
    public void testSaveUser() throws Exception {
        mongo_article user=new mongo_article();
        user.setId("11111");
        user.setTitle("小明");
        user.setSource("fffooo123");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
//        mongo_article user= userDao.findUserByUserName("腾讯");
 //       System.out.println("user is "+user);
    }



    @Test
    public void deleteUserById(){
        userDao.deleteUserById("");
    }
}



