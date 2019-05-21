package com.felix.project.commodity.mapper;

import com.felix.project.commodity.model.Commodity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityId);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String commodityId);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}