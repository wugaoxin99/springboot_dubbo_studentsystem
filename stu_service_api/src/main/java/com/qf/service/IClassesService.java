package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;

public interface IClassesService {
    PageInfo<Classes> getPageList(MyPage page);

    Classes getClassById(Integer id);

    void updateClass(Classes classes);

    void deleteById(Integer id);

    void add(Classes classes);
}
