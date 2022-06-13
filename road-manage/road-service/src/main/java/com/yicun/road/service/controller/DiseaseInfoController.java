package com.yicun.road.service.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicun.road.service.pojo.disease.TDefectsPits;
import com.yicun.road.service.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 病害信息管理控制器
 */
@RestController
@RequestMapping("/disease/")
public class DiseaseInfoController {

    @Autowired
    private DiseaseService diseaseService;

    /**
     * 查询病害信息列表
     * @param tDefectsPits
     * @return
     */
    @PostMapping("queryList")
    public Page<TDefectsPits> queryTDefectsPitsList(@RequestBody TDefectsPits tDefectsPits){
        try {
            Page<TDefectsPits> page = diseaseService.queryTDefectsPitsList(tDefectsPits);
            return page;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
