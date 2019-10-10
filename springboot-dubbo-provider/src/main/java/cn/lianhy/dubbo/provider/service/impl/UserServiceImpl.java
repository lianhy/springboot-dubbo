package cn.lianhy.dubbo.provider.service.impl;

import cn.lianhy.dubbo.open.form.UserFO;
import cn.lianhy.dubbo.open.service.UserService;
import cn.lianhy.dubbo.open.to.UserTO;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<UserTO> getList(UserFO fo) {
        log.info("消费者传入："+ JSON.toJSONString(fo));
        UserTO userTO=new UserTO();
        userTO.setAge(1);
        userTO.setUserName("Li Ming");
        return Arrays.asList(userTO);
    }
}
