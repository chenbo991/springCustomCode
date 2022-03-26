package cn.enjoy.config;

import cn.enjoy.beanPostProcessor.DIAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @Classname AutoConfig
 * @Description TODO
 * @Author bozi
 * Date 2020/12/3 17:24
 * Version 1.0
 * 在实践的时候。这个类只是一个jar包。他并没有被引入到spirng管理中。
 * 需要在我们的业务代码把这个类配置到spring容器中。
 * 这个时候，一般采用的引入的方式是采用@import注解。把这个类也加入spring管理.
 * 也就会去解析当前类中的@bean，和@import.
 */
@Import(AutoConfigurationImportSelector.class)
public class AutoConfig {

    @Bean
    public DIAnnotationBeanPostProcessor diAnnotationBeanPostProcessor() {
        return new DIAnnotationBeanPostProcessor();
    }
}
