package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassesServiceImpl implements IClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public PageInfo<Classes> getPageList(MyPage page) {
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        /*List<Classes> classesList=classesMapper.getClassesList();*/
        List<Classes> classesList=classesMapper.selectList(null);
        return new PageInfo<>(classesList);
    }
}
