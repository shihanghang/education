package com.edu.config;

import com.edu.shiro.MyRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;


import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 17:49
 * @Description: 本类是一个配置类，此对象用来初始化系统
 */
@EnableAutoConfiguration
public class ShiroConfig {
    //创建shiro安全过滤器
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(
            @Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
        //给过滤器装配安全策略
        filterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        //定义过滤规则
        Map<String,String> map=new HashMap<>();
        //需要登陆才能访问的资源
        map.put("/main","index");
        //需要过滤的定义
        filterFactoryBean.setFilterChainDefinitionMap(map);
        //设置默认的登陆页面
        filterFactoryBean.setLoginUrl("/login");
        //权限不足时显示的页面
        filterFactoryBean.setUnauthorizedUrl("error1");
        return filterFactoryBean;
    }
    @Bean("defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("myRealm") MyRealm myRealm){
        DefaultWebSecurityManager webSecurityManager = new DefaultWebSecurityManager();
        //组装realm到securityManager中
        webSecurityManager.setRealm(myRealm);
        return webSecurityManager;
    }
    @Bean("myRealm")
    public MyRealm myRealm(
            @Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher hashedCredentialsMatcher){
        MyRealm myRealm = new MyRealm();
        myRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        myRealm.setAuthenticationCachingEnabled(false);
        return myRealm;
    }

    /**
     * @return
     * 通过aop代理拦截权限设定
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator=new DefaultAdvisorAutoProxyCreator();
        //设置代理的模式为cglib proxy/jdk proxy
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
    /**
     * @return
     * 设置注解拦截源码中的权限设定
     */
  /*  @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
            @Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager webSecurityManager
    ){
        AuthorizationAttributeSourceAdvisor sourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        sourceAdvisor.setSecurityManager(webSecurityManager);
        return sourceAdvisor;
    }*/

    /**
     * @return
     * 创建凭证匹配器
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
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
