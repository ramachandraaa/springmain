import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Pearson(String name, int age){};
@Configuration
public class HelloworldConfuguration {
    @Bean
    public String name()
    {

       return "Hello Ram!";
    }
    @Bean
    public int age()
    {
        return 15;
    }
    @Bean(name = "Raju")
    public Pearson pearson()
    {
        //var pearson=new Pearson("Ravi",20);
        return new Pearson("Ramachandra",20);
    }


}
