import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloworld1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloworld2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        boolean helloworld = helloworld1.equals(helloworld2);
        boolean cat = cat1.equals(cat2);

        System.out.println("cat = " + cat);
        System.out.println("helloworld = " + helloworld);
    }
}