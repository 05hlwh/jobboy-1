package jobboy.mapper;

import jobboy.po.Usert;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usert record);

    int insertSelective(Usert record);

    Usert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usert record);

    int updateByPrimaryKey(Usert record);
}