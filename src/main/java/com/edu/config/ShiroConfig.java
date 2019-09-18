package com.edu.config;

import com.edu.shiro.MyRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 18:05
 * @Description:
 */
@Configuration
public class ShiroConfig {
    //创建安全过滤器
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(
            @Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
        //给过滤器装配安全策略
        filterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        //定义过滤规则
        Map<String, String> map = new HashMap<>();
        //需要登陆才能访问的资源
        map.put("/main", "authc");
        //需要过滤的定义
        filterFactoryBean.setFilterChainDefinitionMap(map);
        //设置默认的登陆页面
        filterFactoryBean.setLoginUrl("/login");
        //权限不足时显示的页面
        filterFactoryBean.setUnauthorizedUrl("error");
        return filterFactoryBean;
    }

    @Bean("defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("myRealm") MyRealm myRealm) {
        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();
        //组装realm到securityManager中
        webSecurityManager.setRealm(myRealm);
        return webSecurityManager;

    }

    @Bean("myRealm")
    public MyRealm myRealm(
            @Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher hashedCredentialsMatcher
    ) {
        MyRealm myRealm = new MyRealm();
        myRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        myRealm.setAuthenticationCachingEnabled(false);
        return myRealm;
    }
    /**
     * @return
     * 创建凭证匹配器
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        //设置加密算法
        credentialsMatcher.setHashAlgorithmName("MD5");
        //设置shiro缓存的凭证字符串编码
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        //设置hash频次
        credentialsMatcher.setHashIterations(1024);
        return credentialsMatcher;
    }
}
