package com.springinaction.springidol;

import com.springinaction.springidol.observer.Course;
import com.springinaction.springidol.observer.CourseFullEvent;
import com.springinaction.springidol.observer.RefreshListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoursesMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/extended-di.xml");
        RefreshListener listener = (RefreshListener) context.getBean("refreshListener");
        context.publishEvent(new CourseFullEvent(listener, new Course()));
    }
}
