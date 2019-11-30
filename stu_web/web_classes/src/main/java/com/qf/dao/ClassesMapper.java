package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Classes;

import java.util.List;

public interface ClassesMapper extends BaseMapper<Classes> {
    List<Classes> getClassesList();
}
