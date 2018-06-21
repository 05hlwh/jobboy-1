package jobboy.mapper;

import jobboy.po.Announcement;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnnouncementMapper {
    int deleteByPrimaryKey(Integer anId);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Integer anId);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);

    List<Announcement> selectAll();
}