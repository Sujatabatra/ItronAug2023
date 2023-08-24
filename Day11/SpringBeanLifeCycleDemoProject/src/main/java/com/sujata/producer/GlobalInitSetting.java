package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class GlobalInitSetting implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6. "+beanName+" Pre-Initialization BeanPostProcessors");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("9. "+beanName+" post-Initialization Bean Post Processors");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
