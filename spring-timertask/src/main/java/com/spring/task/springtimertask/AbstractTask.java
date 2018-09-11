package com.spring.task.springtimertask;

import org.quartz.Job;

import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Project_Name：spring-timertask
 * @Package_Name：com.spring.task.springtimertask
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  11:28 2018/9/10
 * @Version： v1.0
 * @Modifiled By
 * @Note：
 **/
public abstract  class AbstractTask implements Job {

    private Logger logger = LoggerFactory.getLogger(AbstractTask.class);

    protected abstract void executeInternal(JobExecutionContext context);

    protected String cronExpression;

    @Override
    public void execute(JobExecutionContext context) {
        try {
            executeInternal(context);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            logger.error("job execute failed!");
        }
    }

    public String getCronExpression() {
        return cronExpression;
    }
}
