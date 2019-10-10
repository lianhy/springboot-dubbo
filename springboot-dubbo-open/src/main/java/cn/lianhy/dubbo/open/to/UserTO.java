package cn.lianhy.dubbo.open.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserTO implements Serializable{
    private String userName;
    private Integer age;
}
