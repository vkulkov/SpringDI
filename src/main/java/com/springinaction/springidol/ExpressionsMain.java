package com.springinaction.springidol;

import com.springinaction.springidol.other.ExpressionInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressionsMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

        ExpressionInjection expressions = (ExpressionInjection) context.getBean("expressions");
        System.out.println(expressions.toString());
    }
}
