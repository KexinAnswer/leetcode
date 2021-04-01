package com.javacode2021.springbootchat01.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyh
 * @version V1.0
 * @ClassName: IndexController
 * @Description: TODO
 * @date 2021/3/31 下午6:11
 */

@RestController
@RequestMapping("/spring")
public class IndexController {

    @PostMapping
    public String index() {
        return "Hello spring!";
    }
}
