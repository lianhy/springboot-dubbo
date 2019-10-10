package cn.lianhy.dubbo.open.form;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserFO implements Serializable{
    private String userName;
    private Integer age;
}
