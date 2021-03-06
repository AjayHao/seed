package com.ajayhao.seed;

import com.ajayhao.seed.entity.OrgInfoEntity;
import com.ajayhao.seed.entity.UserInfoEntity;
import com.ajayhao.seed.mapper.OrgInfoMapper;
import com.ajayhao.seed.mapper.UserMapper;
import com.ajayhao.seed.service.OrgService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeedApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrgService orgService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserInfoEntity> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }


    @Test
    public void testSelectByWrapper() {
        System.out.println(("----- select by wrapper test ------"));
        List<OrgInfoEntity> orgInfoEntities = orgService.queryOrgList();
        Assert.assertEquals(1, orgInfoEntities.size());
        orgInfoEntities.forEach(System.out::println);
    }
}
