package com.lf;

//run this java file as Java Application


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
        Performer p=(Performer) ctx.getBean("duck");
        try {
            p.perform();
        }catch (Exception e){
            System.err.println("error occurs, say sth.");
        }
    }
}
