package cn.ac.iie.watertop.web.addManager;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.model.Article;
import cn.ac.iie.watertop.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by nlpmonkey on 2018/06/21.
*/
@RestController
@RequestMapping("/adManager")
public class adManagerController {
    @Resource
    private ArticleService articleService;

    @PostMapping ("/listAd")
    public Result add(@RequestParam(defaultValue = "0")  String userid, @RequestParam(defaultValue = "0")  String  starttime, @RequestParam(defaultValue = "0")  String type) {
      //  articleService.save(article);
        String image="http://p.soyilu.com/data/epic/ad/lixia.jpg";
        return ResultGenerator.genSuccessResult(image);
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
