package com.ajayhao.seed.service;

import com.ajayhao.seed.entity.OrgInfoEntity;
import com.ajayhao.seed.mapper.OrgInfoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgService {

    @Autowired
    private OrgInfoMapper orgInfoMapper;

    public List<OrgInfoEntity> queryOrgList() {
        QueryWrapper<OrgInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("ORG_ID", 3);
        return orgInfoMapper.selectList(queryWrapper);
    }
}
