package cn.enjoy.config;

import cn.enjoy.handler.InvokeHandler;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 兼容spring工程方式
 * @Classname AutoConfigurationImportSelector
 * @Description TODO
 * @Author Jack
 * Date 2020/11/19 15:52
 * Version 1.0
 */

/**
 * 因为这个类AutoConfigurationImportSelector。使在被autoconfig的@import引入的。这个类又实现了。ImportSelector
 * 所以这个类就湖在spring启动的第五步，就会比执行到这个方法。selectImports。把返回的值全类命名。全部都变为beandef,被spirng容器。管理。
 * 这个InvokeHandler是我们的实现调用的逻辑。会在动态代理InvokeProxy的调用这个类。每个InvokeHandler的实现类都是不同的策略。
 */
public class AutoConfigurationImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> invokeHandlerclassNames = SpringFactoriesLoader.loadFactoryNames(InvokeHandler.class, ClassUtils.getDefaultClassLoader());
        return StringUtils.toStringArray(invokeHandlerclassNames);
    }
}
