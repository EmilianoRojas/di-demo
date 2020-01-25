package springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.controllers.ConstructorInjectedController;
import springframework.controllers.MyController;
import springframework.controllers.PropertyInjectedController;
import springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        //System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        //System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
