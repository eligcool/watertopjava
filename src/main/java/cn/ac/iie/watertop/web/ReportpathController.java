package cn.ac.iie.watertop.web;
import cn.ac.iie.watertop.core.Result;
import cn.ac.iie.watertop.core.ResultGenerator;
import cn.ac.iie.watertop.model.Reportpath;
import cn.ac.iie.watertop.service.ReportpathService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by nlpmonkey on 2018/08/12.
*/
@RestController
@RequestMapping("/reportpath")
public class ReportpathController {
    @Resource
    private ReportpathService reportpathService;

    @PostMapping("/add")
    public Result add(Reportpath reportpath) {
        reportpathService.save(reportpath);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        reportpathService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Reportpath reportpath) {
        reportpathService.update(reportpath);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Reportpath reportpath = reportpathService.findById(id);
        return ResultGenerator.genSuccessResult(reportpath);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Reportpath> list = reportpathService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
