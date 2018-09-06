package cn.ac.iie.watertop.web.addManager;

import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.model.Article;
import cn.ac.iie.watertop.service.ArticleService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by nlpmonkey on 2018/06/21.
*/
@RestController
@RequestMapping("/userManager")
public class userManagerController {
    @Resource
    private ArticleService articleService;

    //用于保存收藏信息
    @PostMapping ("/appuserdata")
    public Result add(@RequestParam(defaultValue = "0")  String id, @RequestParam(defaultValue = "0")  String  userid, @RequestParam(defaultValue = "0")  String type) {
      //  articleService.save(article);
        JSONObject jsonOne = new JSONObject();
        jsonOne.put("id",id);
        jsonOne.put("userid",userid);
        jsonOne.put("datafrom","news2");
        jsonOne.put("lasttime",1529573000);
        return ResultGenerator.genSuccessResult(jsonOne);
    }
//用于读取收藏信息
    @PostMapping ("/appreaduserdata")
    public Result appreaduserdata(@RequestParam(defaultValue = "allnum")  String rdata,@RequestParam(defaultValue = "0")  String  userid,@RequestParam(defaultValue = "0")  String type) {
        //  articleService.save(article);
        JSONObject jsonOne = new JSONObject();
        if(rdata.contains("allnum")) {
            jsonOne.put("plnum", 144);
            jsonOne.put("collectnum", 299);
        }else if(rdata.contains("collect")){
            PageHelper.startPage(1, 5);
            List<Article> list = articleService.findAll();
            PageInfo pageInfo = new PageInfo(list);

            return ResultGenerator.genSuccessResult(pageInfo.getList());
        }

        return ResultGenerator.genSuccessResult(jsonOne);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        articleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Article article) {
        articleService.update(article);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Article article = articleService.findById(id);
        return ResultGenerator.genSuccessResult(article);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
