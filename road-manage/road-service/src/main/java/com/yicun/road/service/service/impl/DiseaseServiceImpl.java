package com.yicun.road.service.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicun.road.service.mapper.TDefectsPitsMapper;
import com.yicun.road.service.pojo.disease.TDefectsPits;
import com.yicun.road.service.service.DiseaseService;
import com.yicun.road.service.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    private TDefectsPitsMapper tDefectsPitsMapper;
    @Autowired
    private PageUtil pageUtil;


    public Page<TDefectsPits> queryTDefectsPitsList(TDefectsPits tDefectsPits) throws Exception{
        return tDefectsPitsMapper.queryTDefectsPitsList(pageUtil.defaultPage(tDefectsPits.getCurrPage(),tDefectsPits.getPageSize()),tDefectsPits);
    }


    public int insertTDefectsPits(TDefectsPits tDefectsPits) throws Exception{
        return tDefectsPitsMapper.insert(tDefectsPits);
    }


}
