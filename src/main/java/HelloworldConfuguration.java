import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldConfuguration {
    @Bean
    public String name()
    {

        return "Ram";
    }

}
