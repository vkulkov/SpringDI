package com.springinaction.springidol;

import com.springinaction.springidol.postprocess.Rabbit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/extended-di.xml");
        Rabbit rabbit = (Rabbit) context.getBean("bugs");
        System.out.println(rabbit.getDescription());
    }
}
