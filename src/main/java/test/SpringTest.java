package test;

import com.dao.TestDao;
import com.dao.TestDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo(){

        TestDaoImpl a = new TestDaoImpl();
        System.out.println(a.sayHello());
    }
}
