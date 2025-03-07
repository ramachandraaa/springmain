import com.ramdev.demo.hirnunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Helloworldspring {
    public static void main(String[] args) {
        //Launch Spring context-
        //confugure the things we want the spring to manage-@confuguration
        var context=new AnnotationConfigApplicationContext(hirnunner.class);
System.out.println(context.getBean("square"));
    }
}
