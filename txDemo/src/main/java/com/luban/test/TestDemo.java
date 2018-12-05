package com.luban.test;

import com.luban.appConfig.App;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luban.service.BuyService;

public class TestDemo {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(App.class);
        BuyService buyService = (BuyService) annotationConfigApplicationContext.getBean("buyService");
        buyService.update();
    }
}
