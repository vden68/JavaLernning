package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());



//        Cat myCat = context.getBean("catBeen", Cat.class);
//        myCat.say();

        context.close();
    }
}
