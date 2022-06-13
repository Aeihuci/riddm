package com.yicun.road.service.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicun.road.service.pojo.base.ResultCode;
import com.yicun.road.service.pojo.base.RspPageInfo;
import com.yicun.road.service.pojo.disease.TDefectsPits;
import com.yicun.road.service.service.DiseaseService;
import com.yicun.road.service.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 病害信息管理控制器
 */
@RestController
@CrossOrigin
@RequestMapping("/disease/")

public class DiseaseInfoController {

    @Autowired
    private DiseaseService diseaseService;

    /**
     * 查询病害信息列表
     * @param tDefectsPits
     * @return
     */
    @PostMapping("queryDiseaseList")
    public RspPageInfo<List<TDefectsPits>> queryTDefectsPitsList(@RequestBody TDefectsPits tDefectsPits){
        try {
            Page<TDefectsPits> page = diseaseService.queryTDefectsPitsList(tDefectsPits);
            return ResponseUtil.makePageRsp(ResultCode.SUCCESS.CODE, page.getTotal(),"",page.getRecords());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.makePageRsp(ResultCode.FAIL.CODE,0,"系统异常:" + e.getMessage(),null);
        }
    }


}
