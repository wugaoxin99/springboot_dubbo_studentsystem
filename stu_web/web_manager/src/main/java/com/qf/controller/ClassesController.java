package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Classes;
import com.qf.entity.MyPage;
import com.qf.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
    @RequestMapping("/toUpdate")
    public String toUpdate(Integer id, ModelMap map){
        Classes classes=classesService.getClassById(id);
        map.put("classes",classes);
        return "class_update";
    }
    @RequestMapping("/update")
    public String update(Classes classes){
        classesService.updateClass(classes);
        return "redirect:/cls/list";
    }
    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        classesService.deleteById(id);
        return "redirect:/cls/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "cls_add";
    }
    @RequestMapping("/add")
    public String add(Classes classes){
        classesService.add(classes);
        return "redirect:/cls/list";
    }

}
