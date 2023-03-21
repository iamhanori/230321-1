package kr.hs.study.beans;

import kr.hs.study.beans.Job;

public class Person {
    String name;
    int age;
    Job job;


    public Person(String name) {
        this.name = "person";
        this.age = 1;
        this.job = null;
    }

    public Person(int age) {
        this.name = "person";
        this.age = age;
        this.job = null;
    }

    public Person(Job job) {
        this.name = "person";
        this.age = 3;
        this.job = job;
    }


    public void pr(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("job : " + job);
    }

}


