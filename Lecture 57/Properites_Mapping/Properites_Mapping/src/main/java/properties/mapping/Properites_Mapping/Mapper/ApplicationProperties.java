package properties.mapping.Properites_Mapping.Mapper;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Data
@EnableConfigurationProperties
@Configuration
@ConfigurationProperties
public class ApplicationProperties {

    private Map<String,String > messages=new HashMap<>();
}
