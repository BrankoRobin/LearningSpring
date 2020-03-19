package com.spring.core.Learning;

import com.spring.core.Learning.model.Addition;
import com.spring.core.Learning.model.Multiplication;
import com.spring.core.Learning.model.Opertion;
import com.spring.core.Learning.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearningApplication.class, args);

        //OVO NE MORAS OD STARTA ODKOMENTARISATI
//        Opertion operation = context.getBean(Opertion.class);
        Opertion addition1 = (Addition) context.getBean(Opertion.class);
        Opertion multiplication1 = (Multiplication) context.getBean(Opertion.class);
        Addition addition2 = (Addition) context.getBean(Addition.class);
        Multiplication multiplication2 = (Multiplication) context.getBean(Multiplication.class);
        Addition addition3 = (Addition) context.getBean("addition");
        Multiplication multiplication3 = (Multiplication) context.getBean("multiplication");

        Person person1 = (Person) context.getBean("person1");
        Person person2 = (Person) context.getBean("person2");

          //OVO NE MORAS OD STARTA ODKOMENTARISATI
//        System.out.println(operation.getCalculatedValue(3));

        //PRVO OVO OTKOMENTARISI KAD IMPLEMENTIRAS SVE
//        System.out.println(addition1.getCalculatedValue(3));
//        System.out.println(multiplication1.getCalculatedValue(3));
//        System.out.println(multiplication1.getCalculatedValue(7));
//
//        System.out.println(addition2.getCalculatedValue(5));
//        System.out.println(multiplication2.getCalculatedValue(5));
//
//        System.out.println(addition3.getCalculatedValue(11));
//        System.out.println(multiplication3.getCalculatedValue(11));
//
//        System.out.println(person1.getFullName());
//        System.out.println(person2.getFullName());

    }

}
