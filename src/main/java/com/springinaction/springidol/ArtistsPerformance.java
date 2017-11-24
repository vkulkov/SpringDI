package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ArtistsPerformance {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

        List<Performer> performers = new ArrayList<>();
        performers.add((Performer) context.getBean("duke"));
        performers.add((Performer) context.getBean("poeticDuke"));
        performers.add((Performer) context.getBean("kenny"));
        performers.add((Performer) context.getBean("carl"));
        performers.add((Performer) context.getBean("ricky"));
        performers.add((Performer) context.getBean("hank"));
        performers.add((Performer) context.getBean("terry"));

        for (Performer performer :
                performers) {
            performer.perform();
        }
    }
}
