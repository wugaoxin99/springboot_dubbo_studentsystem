package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StudentMapper;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int getStuCountByCid(Integer cid) {
        return studentMapper.getStuCountByCid(cid);
    }
}
