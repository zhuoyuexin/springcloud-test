package com.spring.task.springtimertask;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * @Project_Name：spring-timertask
 * @Package_Name：com.spring.task.springtimertask
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  17:42 2018/9/11
 * @Version： v1.0
 * @Modifiled By
 * @Note：
 **/
@RestController
public class APIController {

    @RequestMapping("/api")
    public String  index(){
        //Object[] options = {"继续工作","下班啦"}; //弹窗
        //int response= JOptionPane.showOptionDialog(new JFrame(), "休息一下吧~","",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return "ok";
    }
}
