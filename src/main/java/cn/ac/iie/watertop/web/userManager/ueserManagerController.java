package cn.ac.iie.watertop.web.userManager;

import cn.ac.iie.watertop.service.ArticleService;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by nlpmonkey on 2018/06/21.
*/
@RestController
@RequestMapping("/userManager")
public class ueserManagerController {
    @Resource
    private ArticleService articleService;



    @PostMapping("/useradmin")
    public Result list(@RequestParam(defaultValue = "login") String enews, @RequestParam(defaultValue = "admin") String username, @RequestParam(defaultValue = "admin") String password, @RequestParam(defaultValue = "0") Integer equestion) {
        JSONObject jsonOne = new JSONObject();
        if(enews.contains("login")) {

            jsonOne.put("token", "zF8sB7xTG0UsHGxQ1Fon");
            jsonOne.put("loginip", "121.22.243.235");
            jsonOne.put("tname", null);
            jsonOne.put("cache_mess", "LoginSuccess");
            jsonOne.put("userid", "2");
        }else if(enews.contains("check")){
            jsonOne.put("city", "Zhuhai");
            jsonOne.put("content", null);
            jsonOne.put("country", "CN");
            jsonOne.put("headimgurl", null);
            jsonOne.put("nickname", "牛牛");
            jsonOne.put("plnum", null);
            jsonOne.put("province", "Guangdong");
            jsonOne.put("userid", "2");
            jsonOne.put("usertype", "weixin");
        }


        return ResultGenerator.genSuccessResult(jsonOne);
    }
}
