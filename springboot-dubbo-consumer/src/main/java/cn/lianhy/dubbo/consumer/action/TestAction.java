package cn.lianhy.dubbo.consumer.action;

import cn.lianhy.dubbo.open.form.UserFO;
import cn.lianhy.dubbo.open.service.UserService;
import cn.lianhy.dubbo.open.to.UserTO;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestAction {

    @Reference
    private UserService userService;

    @GetMapping(value = "test.do")
    public String test(){
        UserFO userFO=new UserFO();
        userFO.setAge(10);
        userFO.setUserName("Han mei mei");
        List<UserTO> list=userService.getList(userFO);
        return JSON.toJSONString(list);
    }
}
