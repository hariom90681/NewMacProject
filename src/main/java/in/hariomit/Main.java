package in.hariomit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //starting the iOC container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //getting bean object from the Ioc
       Car car=context.getBean(Car.class);
        car.drive();
    }
}