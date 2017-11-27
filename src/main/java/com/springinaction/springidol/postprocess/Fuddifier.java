package com.springinaction.springidol.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class Fuddifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                if (field.getType().equals(String.class)) {
                    field.setAccessible(true);
                    String original = (String) field.get(bean);
                    field.set(bean, fuddify(original));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }

    private String fuddify(String original) {
        if (original == null) {
            return original;
        }
        return original.replaceAll("([rl])", "w").replaceAll("([RL])", "W");
    }
}
