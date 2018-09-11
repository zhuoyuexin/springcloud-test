package com.spring.task.springtimertask;

import com.spring.task.springtimertask.utils.InfoUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project_Name：spring-timertask
 * @Package_Name：com.spring.task.springtimertask
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  10:05 2018/9/10
 * @Version： v1.0
 * @Modifiled By
 * @Note：
 **/
@Component
public class QuartzService {

    private final static String TITLE="任务提醒：";
    //    每分钟启动
    @Scheduled(cron = "0 0/30 17 * * *")
    public void timerToNow(){
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    //    每分钟（0 0/1 * * * ?）启动 弹窗  0 0/10 14 * * *
    @Scheduled(cron = "0 0/30 17 * * *")
    public void Work_Notification(){
        System.out.println("任务提醒！");
        InfoUtil test = new InfoUtil();
        test.show(TITLE, "需写工作日志！");
    }
}
