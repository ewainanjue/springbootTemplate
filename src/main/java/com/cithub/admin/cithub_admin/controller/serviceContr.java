package com.cithub.admin.cithub_admin.controller;

import com.alibaba.fastjson.JSONObject;
import com.cithub.admin.cithub_admin.services.dataInterface.service.serviceInter;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class serviceContr {
    @Autowired
    private serviceInter sInter;
    @GetMapping(value = "/getAllService/{pageNumber}/{pageSize}")
    public String listAll(@PathVariable Integer pageNumber,@PathVariable Integer pageSize)
    {
        JSONObject res = new JSONObject();
        Page page = sInter.listAll(pageNumber, pageSize);
        res.put("ServiceList", page.getResult());
        res.put("total", page.getTotal());
        return res.toJSONString();
    }

}
