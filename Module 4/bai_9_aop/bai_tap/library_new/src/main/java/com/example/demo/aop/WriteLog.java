package com.example.demo.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Aspect
public class WriteLog {
    public static String bookName;
    @AfterReturning(pointcut = "execution(public * com.example.demo.controller.BookController.borrow(..))")
    public void afterBorrow() throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/phantrungson/Documents/java/module 4/bai_9_aop/bai_tap/library_new/src/main/resources/static/library",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("borrowed "+ bookName);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
    @AfterReturning(pointcut = "execution(public * com.example.demo.controller.BookController.giveBack(..))")
    public void afterGiveBack() throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/phantrungson/Documents/java/module 4/bai_9_aop/bai_tap/library_new/src/main/resources/static/library",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Given back "+ bookName);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
