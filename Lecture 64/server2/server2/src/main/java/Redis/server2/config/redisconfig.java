package Redis.server2.config;

import Redis.server2.binding.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class redisconfig {

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        return factory;
    }

    @Bean
    @Primary
    public RedisTemplate<String, Employee> redisTemplate(){
        RedisTemplate<String,Employee> template =new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
}
