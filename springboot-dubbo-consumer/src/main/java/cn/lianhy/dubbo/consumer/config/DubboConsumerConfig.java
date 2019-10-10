package cn.lianhy.dubbo.consumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConsumerConfig {

    /**
     * 应用配置
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig=new ApplicationConfig();
        applicationConfig.setName("springboot-dubbo-consumer");
        return applicationConfig;
    }

    /**
     * 注册中心配置
     * @return
     */
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig=new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 监控中心设置
     * @return
     */
//    @Bean
//    public MonitorConfig monitorConfig(){
//        MonitorConfig monitorConfig=new MonitorConfig();
//        monitorConfig.setProtocol("registry");
//        return monitorConfig;
//    }
}
