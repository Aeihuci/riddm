package com.yicun.road.service.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicun.road.service.pojo.disease.TDefectsPits;

/**
 * 病害信息管理Service
 */
public interface DiseaseService {

    /**
     * 查询病害信息列表
     * @return
     */
    Page<TDefectsPits> queryTDefectsPitsList(TDefectsPits tDefectsPits) throws Exception;

    /**
     * 新增病害信息
     * @param tDefectsPits
     * @return
     * @throws Exception
     */
    int insertTDefectsPits(TDefectsPits tDefectsPits) throws Exception;

    //todo 修改

    //todo 删除
}
