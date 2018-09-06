package cn.ac.iie.watertop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eligcool on 2018/8/12.
 */

@Controller
public class IndexController {
    @GetMapping("/html")
    public String html() {
        return "index";

    }
}
