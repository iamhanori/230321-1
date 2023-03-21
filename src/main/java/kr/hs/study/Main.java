package kr.hs.study;

import kr.hs.study.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Person p = ctx.getBean("p1", Person.class);
        p.pr();
        Person p2 = ctx.getBean("p2", Person.class);
        p2.pr();
        Person p3 = ctx.getBean("p3", Person.class);
        p3.pr();


        ctx.close();
    }
}
