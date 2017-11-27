package com.springinaction.springidol;

import com.springinaction.springidol.propeditor.Contact;
import com.springinaction.springidol.propeditor.PhoneNumber;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyEditorMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/springinaction/springidol/extended-di.xml");

        Contact contact = (Contact) context.getBean("contact");
        PhoneNumber phoneNumber = contact.getPhoneNumber();
        System.out.printf("Phone number:  %s(%s)-%s%n",
                phoneNumber.getAreaCode(),
                phoneNumber.getPrefix(),
                phoneNumber.getNumber());
    }
}
