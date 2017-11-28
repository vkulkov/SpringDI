package com.springinaction.springidol;

import com.springinaction.springidol.scripting.ICoconut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScriptingMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/scripting.xml");

        ICoconut coconut = (ICoconut) context.getBean("groovyCoconut");
        coconut.drinkThemBothUp();
    }
}
