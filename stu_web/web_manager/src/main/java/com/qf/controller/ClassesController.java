package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;
import com.qf.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cls")
public class ClassesController {
    @Reference
    private IClassesService classesService;
    @RequestMapping("/list")
    public String list(Model model, MyPage page){
        PageInfo<Classes> pageInfo = classesService.getPageList(page);
        model.addAttribute("pageInfo",pageInfo);
        return "classes_list";
    }
}
