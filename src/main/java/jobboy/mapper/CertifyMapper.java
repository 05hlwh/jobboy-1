package jobboy.mapper;

import jobboy.po.Certify;

public interface CertifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Certify record);

    int insertSelective(Certify record);

    Certify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Certify record);

    int updateByPrimaryKey(Certify record);
}