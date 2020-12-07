package com.example.producer.mapper;

import com.example.producer.entity.Tourism;

import java.util.List;

public interface TourismMapper {
    int deleteByPrimaryKey(Long tourismId);

    int insert(Tourism record);

    int insertSelective(Tourism record);

    Tourism selectByPrimaryKey(Long tourismId);

    int updateByPrimaryKeySelective(Tourism record);

    int updateByPrimaryKey(Tourism record);

    List<Tourism> selectTourismList();
}