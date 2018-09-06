package cn.ac.iie.watertop.web;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.model.Appvideo;
import cn.ac.iie.watertop.service.AppvideoService;
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
@RequestMapping("/appvideo")
public class AppvideoController {
    @Resource
    private AppvideoService appvideoService;

    @PostMapping("/add")
    public Result add(Appvideo appvideo) {
        appvideoService.save(appvideo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        appvideoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Appvideo appvideo) {
        appvideoService.update(appvideo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Appvideo appvideo = appvideoService.findById(id);
        return ResultGenerator.genSuccessResult(appvideo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Appvideo> list = appvideoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
