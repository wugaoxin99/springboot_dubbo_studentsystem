package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;
import com.qf.service.IClassesService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassesServiceImpl implements IClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Reference
    private IStudentService studentService;
    @Override
    public PageInfo<Classes> getPageList(MyPage page) {
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        List<Classes> classesList=classesMapper.selectList(null);
        for (Classes classes : classesList) {
            int count = studentService.getStuCountByCid(classes.getId());
            classes.setCnum(count);
        }
        return new PageInfo<>(classesList);
    }
}
