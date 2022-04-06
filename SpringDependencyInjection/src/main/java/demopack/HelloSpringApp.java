package demopack;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp{
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach1 = context.getBean("myCoach",Coach.class); //id and interface

        //call methods on the bean
        System.out.println(coach1.getDailyWorkout());

        //let's call our new method for fortunes
        System.out.println(coach1.getDailyFortune());

        //close the context
        context.close();
    }
}