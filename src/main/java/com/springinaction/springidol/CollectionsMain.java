package com.springinaction.springidol;

import com.springinaction.springidol.other.CollectionsManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/p-notation.xml");

        CollectionsManager randomCity = (CollectionsManager) context.getBean("randomCity");
        System.out.println(randomCity.getChosenCity());

        CollectionsManager bigCityNames = (CollectionsManager) context.getBean("bigCityNames");
        System.out.println(bigCityNames.getCityNames());
    }
}
