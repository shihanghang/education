package com.edu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.awt.*;
import java.net.URI;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/19 10:41
 * @Description:
 */
@Component
public class MyCommandRunner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(MyCommandRunner.class);
    @Value("http://localhost:8080/opop")
    private String loginUrl;

    @Value("C:/Program Files/Mozilla Firefox/firefox.exe")
    private String googleExcutePath;

    @Value("true")
    private boolean isOpen;

    @Override
    public void run(String... args) throws Exception {
        if(isOpen){
            String cmd = googleExcutePath +" "+ loginUrl;
            Runtime run = Runtime.getRuntime();
            try{
                run.exec(cmd);
                logger.debug("启动浏览器打开项目成功");
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}