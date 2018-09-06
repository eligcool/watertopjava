package cn.ac.iie.watertop.web;
import cn.ac.iie.watertop.service.ImageinfoService;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.service.mongo_article_service;
import cn.ac.iie.watertop.model.Imageinfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by nlpmonkey on 2018/06/24.
*/
@RestController
@RequestMapping("/imageinfo")
public class ImageinfoController {
    @Resource
    private ImageinfoService imageinfoService;
    @Resource
    private mongo_article_service userDao;
    @PostMapping("/add")
    public Result add(Imageinfo imageinfo) {
        imageinfoService.save(imageinfo);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/testadd")
    public Result testadd(Imageinfo imageinfo) {
        String  user= userDao.findUserByUserName("新京报");
      //  System.out.print("!!!!!"+user.toString());
        return ResultGenerator.genSuccessResult(user);
    }
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        imageinfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Imageinfo imageinfo) {
        imageinfoService.update(imageinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Imageinfo imageinfo = imageinfoService.findById(id);
        return ResultGenerator.genSuccessResult(imageinfo);
    }

    @GetMapping("/picsearch")
    public Result list(@RequestParam(defaultValue = "0") String key,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Imageinfo> list = imageinfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo.getList());
    }
}
