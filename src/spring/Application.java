package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by hcb on 2017/3/1.
 */
public class Application {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring.xml");
        Employee employee = context.getBean("Employee",Employee.class);
        System.out.println(employee.toString());
    }
}
