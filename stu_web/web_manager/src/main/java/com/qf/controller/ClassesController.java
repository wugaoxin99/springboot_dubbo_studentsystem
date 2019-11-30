package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cls")
public class ClassesController {
    @Reference
    private IClassesService classesService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Classes> classesList = classesService.getList();
        model.addAttribute("classesList",classesList);
        return "classes_list";
    }
}
