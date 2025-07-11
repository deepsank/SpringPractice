package com.springcorepractice.learning.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spelConfig.xml");
        Demo d1 = context.getBean("demo", Demo.class);

        System.out.println(d1);

//        SpelExpressionParser spelParser = new SpelExpressionParser();
//        Expression expression = spelParser.parseExpression("4-9");
//        System.out.println(expression.getValue());
    }
}
