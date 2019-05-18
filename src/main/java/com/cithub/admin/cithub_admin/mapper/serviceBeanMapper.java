package com.cithub.admin.cithub_admin.mapper;

import com.cithub.admin.cithub_admin.model.serviceBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface serviceBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(serviceBean record);

    int insertSelective(serviceBean record);

    serviceBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(serviceBean record);

    int updateByPrimaryKey(serviceBean record);
    List<serviceBean> listAll();
}