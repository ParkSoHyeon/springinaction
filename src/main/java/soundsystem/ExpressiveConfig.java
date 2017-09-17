package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/soundsystem/app.properties")
public class ExpressiveConfig {
    @Autowired
    Environment environment;

//    int connectionCount = environment.getProperty("db.connection.count", Integer.class, 30);
    boolean titleExists = environment.containsProperty("disc.title");
    Class<CompactDisc> cdClass = environment.getPropertyAsClass("disc.class", CompactDisc.class);

    @Bean
    public BlankDisc disc() {
//        return new BlankDisc(environment.getProperty("disc.title"), environment.getProperty("disc.artist"));
//        return new BlankDisc(environment.getProperty("disc.title", "Rattle and Hum"), environment.getProperty("disc.artist", "U2"));
        return new BlankDisc(environment.getRequiredProperty("disc.title"), environment.getRequiredProperty("disc.artist"));
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
