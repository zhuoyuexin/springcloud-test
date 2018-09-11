package com.spring.task.springtimertask;

import com.spring.task.springtimertask.utils.InfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
public class SpringTimertaskApplication {

    private final static String TITLE="弹窗";
    private static Logger logger = LoggerFactory.getLogger(SpringTimertaskApplication.class);


    public static void main(String[] args) throws InterruptedException {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringTimertaskApplication.class);
        builder.headless(false).web(false).run(args);
        System.out.println("定时任务程序已启动！");
//        QuartzManager quartzManager = new QuartzManager();
//        quartzManager.start();
//        TimeUnit.SECONDS.sleep(10);
//        logger.info("start update job");
//        //修改任务
//        quartzManager.updateJob("testTask", "0/3 * * * * ? ");
//        logger.info("end update job");
//        TimeUnit.SECONDS.sleep(10);
//        TestTask testTask = new TestTask();
//        quartzManager.addJob("testTask", testTask.getClass().getName(), "0 0/1 * * * ?");

        //Object[] options = {"继续工作","下班啦"}; 弹窗
      //  int response= JOptionPane.showOptionDialog(new JFrame(), "休息一下吧~","",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }



}
