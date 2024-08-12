package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = applicationContext.getBean("car", Car.class);
//        Car car1= applicationContext.getBean("car", Car.class);
        System.out.println(car);
        applicationContext.close();



    }
}
