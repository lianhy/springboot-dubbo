package cn.lianhy.dubbo.open.service;

import cn.lianhy.dubbo.open.form.UserFO;
import cn.lianhy.dubbo.open.to.UserTO;

import java.util.List;

public interface UserService {
    List<UserTO> getList(UserFO fo);
}
