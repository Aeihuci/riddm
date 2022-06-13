package com.yicun.road.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicun.road.service.pojo.disease.TDefectsPits;
import com.yicun.road.service.util.PageUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gary
 * @since 2022-06-13
 */
@Mapper
public interface TDefectsPitsMapper extends BaseMapper<TDefectsPits> {

    /**
     * 查询病害信息分页列表
     * @param page
     * @param tDefectsPits
     * @return
     * @throws Exception
     */
    Page<TDefectsPits> queryTDefectsPitsList(Page<TDefectsPits> page,TDefectsPits tDefectsPits) throws Exception;
}
