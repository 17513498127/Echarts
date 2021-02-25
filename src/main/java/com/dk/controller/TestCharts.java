package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("echartsController")
public class TestCharts {

    @RequestMapping("toEcharts")
    public String index(){
        return "echarts_demo";
    }

    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"chen","zhang","zhao","li","wang","jian"};
        int[] data = {5,7,45,36,26,18};
        int[] data2 = {54,73,40,10,30,90};
        map.put("type",type);
        map.put("data",data);
        map.put("data2",data2);
        return map;
    }

}

