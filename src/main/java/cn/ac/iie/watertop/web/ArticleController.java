package cn.ac.iie.watertop.web;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.dao.ArticleMapper;
import cn.ac.iie.watertop.model.Article;
import cn.ac.iie.watertop.service.ArticleService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Created by nlpmonkey on 2018/06/21.
*/
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping("/add")
    public Result add(Article article) {
        System.out.print("文章列表"+article.toString());
        articleService.save(article);
        return ResultGenerator.genSuccessResult();
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
        JSONObject jsonOne = new JSONObject();
        jsonOne= JSONObject.parseObject(JSONObject.toJSONString(article));
        //推荐
        PageHelper.startPage(1, 5);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        jsonOne.put("recommend",pageInfo.getList());
        return ResultGenerator.genSuccessResult(jsonOne);
    }
    @GetMapping("/getdetail")
    public Result getdetail(@RequestParam Integer id) {
        Article article = articleService.findById(id);
        JSONObject jsonOne = new JSONObject();
        jsonOne= JSONObject.parseObject(JSONObject.toJSONString(article));
        //推荐
        PageHelper.startPage(1, 5);
        List<Article> list = articleService.findAll();

        return ResultGenerator.genSuccessResult(jsonOne);
    }
    @GetMapping("/geteditdetail")
    public Result geteditdetail(@RequestParam Integer id) {
        Article article = articleService.findById(id);
//        JSONObject jsonOne = new JSONObject();
//        jsonOne= JSONObject.parseObject(JSONObject.toJSONString(article));
//        //推荐
//        PageHelper.startPage(1, 5);
//        List<Article> list = articleService.findAll();

        return ResultGenerator.genSuccessResult(article);
    }
    @PostMapping("/recommend")
    public Result recommend(@RequestParam Integer id) {
        Article article = articleService.findById(id);
        JSONObject jsonOne = new JSONObject();
        jsonOne= JSONObject.parseObject(JSONObject.toJSONString(article));
        //推荐
        PageHelper.startPage(1, 5);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        jsonOne.put("recommend",pageInfo.getList());
        return ResultGenerator.genSuccessResult(jsonOne);
    }

    @PostMapping("/list")
    public Result list(@RequestParam Integer page, @RequestParam Integer count) {
        System.out.print(page+"->>>>>"+count);
        PageHelper.startPage(page, count);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/applist")
    public Result applist(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer count, @RequestParam(defaultValue = "20") Integer classid) {
        PageHelper.startPage(page, count);
        List<Article> list = articleService.applist(classid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @GetMapping ("/toplist")
    public Result toplist(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer count,@RequestParam(defaultValue = "0") Integer classid) {
        PageHelper.startPage(page, count);
        List<Article> list = articleService.findAll();
       // articleService.findBy("classifier",classifier);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping ("/editarticle")
    public Result editarticle(Article article) {
//        PageHelper.startPage(page, count);
//        List<Article> list = articleService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
        System.out.println(article.toString());
        articleService.update(article);
        return ResultGenerator.genSuccessResult(article);
    }



}
