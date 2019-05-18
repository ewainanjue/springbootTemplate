package com.cithub.admin.cithub_admin.mapper;

import com.cithub.admin.cithub_admin.model.adminCombine;

public interface adminCombineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(adminCombine record);

    int insertSelective(adminCombine record);

    adminCombine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(adminCombine record);

    int updateByPrimaryKey(adminCombine record);
}