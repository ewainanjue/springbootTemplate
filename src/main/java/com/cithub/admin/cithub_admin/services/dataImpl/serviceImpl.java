package com.cithub.admin.cithub_admin.services.dataImpl;
import com.cithub.admin.cithub_admin.mapper.serviceBeanMapper;
import com.cithub.admin.cithub_admin.model.serviceBean;
import com.cithub.admin.cithub_admin.services.dataInterface.service.serviceInter;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements serviceInter {
    @Autowired
    private serviceBeanMapper smaper;
    @Override
    public Page listAll(int pageNumber, int pageSize) {
        Page page = PageHelper.startPage(pageNumber, pageSize);
        List<serviceBean> list = smaper.listAll();
        return page;
    }
}
