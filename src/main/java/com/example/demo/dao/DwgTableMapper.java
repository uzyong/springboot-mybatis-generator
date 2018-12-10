package com.example.demo.dao;

import com.example.demo.model.DwgTable;
import org.apache.ibatis.annotations.Mapper;

//如果不加mapper注解，启动是会报错：could not be found
@Mapper
public interface DwgTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DwgTable record);

    int insertSelective(DwgTable record);

    DwgTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DwgTable record);

    int updateByPrimaryKey(DwgTable record);
}