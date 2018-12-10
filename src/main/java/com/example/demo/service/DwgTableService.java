package com.example.demo.service;

import com.example.demo.dao.DwgTableMapper;
import com.example.demo.model.DwgTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DwgTableService {

    @Autowired
    DwgTableMapper dwgTableMapper;

    public DwgTable findById(Integer id){

        return  dwgTableMapper.selectByPrimaryKey(id);
    }
}
