package com.ajayhao.seed.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author AjayHao
 */
@Data
@TableName("user_info")
public class UserInfoEntity {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
