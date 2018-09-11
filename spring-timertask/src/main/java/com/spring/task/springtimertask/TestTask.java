package com.spring.task.springtimertask;

import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Project_Name：spring-timertask
 * @Package_Name：com.spring.task.springtimertask
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  11:30 2018/9/10
 * @Version： v1.0
 * @Modifiled By
 * @Note：
 **/
@Component("testTask")
public class TestTask extends AbstractTask{

    private Logger logger = LoggerFactory.getLogger(TestTask.class);

    @PostConstruct
    public void init() {
        System.out.println("测试123now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        this.cronExpression = "0 0/1 * * * ?";
    }

    @Override
    protected void executeInternal(JobExecutionContext context) {
        logger.info("test task start execute.");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            logger.info("test task execute interrupted.");
        }
        logger.info("test task execute end.");
    }
}
