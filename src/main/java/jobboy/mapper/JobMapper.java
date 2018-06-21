package jobboy.mapper;

import jobboy.po.Job;
import jobboy.po.selectType;

import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Integer jbId);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jbId);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> selectByType(selectType st);

    List<Job> selectByUserId(Integer userId);
}