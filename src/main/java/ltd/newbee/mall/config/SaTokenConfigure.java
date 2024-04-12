package ltd.newbee.mall.config;

import cn.dev33.satoken.thymeleaf.dialect.SaTokenDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author homan
 * @create 2024-04-12 20:54
 */
@Configuration
public class SaTokenConfigure {
    @Bean
    public SaTokenDialect getSaTokenDialect() {
        return new SaTokenDialect();
    }
}
