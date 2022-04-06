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
        System.out.println(coach1.getDailyWorkout());

        //close the context
        context.close();
    }
}