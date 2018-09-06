package cn.ac.iie.watertop.web;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.model.Articleclass;
import cn.ac.iie.watertop.service.ArticleclassService;
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
@RequestMapping("/articleclass")
public class ArticleclassController {
    @Resource
    private ArticleclassService articleclassService;

    @PostMapping("/add")
    public Result add(Articleclass articleclass) {
        articleclassService.save(articleclass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        articleclassService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Articleclass articleclass) {
        articleclassService.update(articleclass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Articleclass articleclass = articleclassService.findById(id);
        return ResultGenerator.genSuccessResult(articleclass);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Articleclass> list = articleclassService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/classistop")
    public Result classistop(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Articleclass> list = articleclassService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
