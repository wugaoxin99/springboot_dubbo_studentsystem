package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;

public interface IClassesService {
    PageInfo<Classes> getPageList(MyPage page);
}
