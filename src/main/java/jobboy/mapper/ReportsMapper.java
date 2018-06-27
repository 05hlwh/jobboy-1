package jobboy.mapper;

import jobboy.po.Reports;

public interface ReportsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reports record);

    int insertSelective(Reports record);

    Reports selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reports record);

    int updateByPrimaryKey(Reports record);
}