package com.edu.shiro;

import com.edu.pojo.Users;
import com.edu.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/9/11 17:47
 * @Description: 自定义的myrealm安全策略
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
       /* Object primaryPrincipal = principalCollection.getPrimaryPrincipal();
        if (!StringUtils.isEmpty(primaryPrincipal)){
            String userName=(String) primaryPrincipal;
            String role = userService.queryRoleByName(userName);
        }*/
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取身份信息
        Object principal = token.getPrincipal();
        if (!StringUtils.isEmpty(principal)){
            String userName=(String) principal;
            //调用业务逻辑方法查询用户信息
            Users users=userService.findUserByName(userName);
            ByteSource salt = ByteSource.Util.bytes("abc");

            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName,users.getPassword(),salt,getName());
            return authenticationInfo;
        }
        return null;
    }
}
