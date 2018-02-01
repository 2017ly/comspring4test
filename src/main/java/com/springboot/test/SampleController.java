package com.springboot.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "雷雨，springboot !Hello World!";
    }

    public static void main(String[] args) throws Exception {
       /* SpringApplication application = new SpringApplication(SampleController.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);*/

        SpringApplication.run(SampleController.class, args);
    }
}