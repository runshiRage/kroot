package com.kroot.service.task;

import com.kroot.model.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class GenerateStudentTask {
    //3.添加定时任务
    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
        StudentCenter.numberMapStudent.clear();

        for(int i=0; i<10; i++)
        {
            String number = UUID.randomUUID().toString();
            Student stu = new Student();
            stu.name = "测试学生第" + new Random().nextInt(100) + "号";
            stu.number = number;
            stu.sex = i%2 == 0? 0: 1;
            stu.Email = "kroot@qq.com";
            StudentCenter.numberMapStudent.put(number, stu);
        }
    }
}
