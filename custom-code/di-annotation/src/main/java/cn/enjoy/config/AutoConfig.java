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
 * ��ʵ����ʱ�������ֻ��һ��jar��������û�б����뵽spirng�����С�
 * ��Ҫ�����ǵ�ҵ��������������õ�spring�����С�
 * ���ʱ��һ����õ�����ķ�ʽ�ǲ���@importע�⡣�������Ҳ����spring����.
 * Ҳ�ͻ�ȥ������ǰ���е�@bean����@import.
 */
@Import(AutoConfigurationImportSelector.class)
public class AutoConfig {

    @Bean
    public DIAnnotationBeanPostProcessor diAnnotationBeanPostProcessor() {
        return new DIAnnotationBeanPostProcessor();
    }
}
