package ro.devmind.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) throws Exception {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        BeanExample bean = context.getBean("beanExample", BeanExample.class);

        // call methods on the bean
        //bean.randomPackagePrivateMethod();
        //bean.randomPublicMethod(1, "test");
        //bean.callInternalLog();

        bean.throwErrorWhenZero(0);

        // close the context
        context.close();
    }

}
