package cf.tilgiz.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Ilgiz Tukhvatov
 */

@Configuration
@ComponentScan("cf.tilgiz.spring")
@PropertySource("classpath:musicplayer.properties")
public class SpringConfig {
}
