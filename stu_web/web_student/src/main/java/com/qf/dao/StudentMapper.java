package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

public interface StudentMapper extends BaseMapper<Student> {

    int getStuCountByCid(Integer cid);
}
