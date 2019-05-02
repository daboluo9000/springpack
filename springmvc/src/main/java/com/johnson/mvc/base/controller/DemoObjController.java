package com.johnson.mvc.base.controller;

import com.johnson.mvc.base.vo.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoObjController {

    @RequestMapping(produces = "text/plain;charset=utf-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url: "+request.getRequestURL()+" can access";
    }

    @RequestMapping("/pathvar/{str}")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "Get pathvar: "+str;
    }

    @RequestMapping("/requestParam")
    public @ResponseBody String reqParam(String name, HttpServletRequest request){
        return "Get request Param: "+name;
    }


    @RequestMapping(value = "/obj", produces = "application/xml;charset=utf-8")
    @ResponseBody
    public String getObj(@RequestBody DemoObj obj, HttpServletRequest request){
        return "Get Object, name: "+obj.getName()+" id: "+obj.getId();
    }


    @RequestMapping(value = "/returnobj", produces = "application/json;charset=utf-8")
    @ResponseBody
    public DemoObj returnObj(@RequestBody DemoObj obj, HttpServletRequest request){
        return obj;
    }
}
