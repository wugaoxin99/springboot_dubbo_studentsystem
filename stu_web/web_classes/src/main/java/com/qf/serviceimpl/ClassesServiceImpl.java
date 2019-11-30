package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassesServiceImpl implements IClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public List <Classes> getList() {
        List<Classes> classesList=classesMapper.selectList(null);
        return classesList;
    }
}
