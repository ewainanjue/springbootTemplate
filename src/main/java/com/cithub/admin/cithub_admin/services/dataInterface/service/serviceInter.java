package com.cithub.admin.cithub_admin.services.dataInterface.service;

import com.github.pagehelper.Page;

public interface serviceInter {
    Page listAll(int pageNumber, int pageSize);
}
