package jobboy.mapper;

import jobboy.po.Talk;

import java.util.List;

public interface TalkMapper {
    int deleteByPrimaryKey(Integer tkId);

    int insert(Talk record);

    int insertSelective(Talk record);

    Talk selectByPrimaryKey(Integer tkId);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);

    List<Talk> selectBySendId(Integer userId);
}