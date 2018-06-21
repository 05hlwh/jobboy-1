package jobboy.mapper;

import jobboy.po.Ctf_rp;

import java.util.List;

public interface Ctf_rpMapper {
    int deleteByPrimaryKey(Integer crId);

    int insert(Ctf_rp record);

    int insertSelective(Ctf_rp record);

    Ctf_rp selectByPrimaryKey(Integer crId);

    int updateByPrimaryKeySelective(Ctf_rp record);

    int updateByPrimaryKey(Ctf_rp record);

    List<Ctf_rp> selectAll();
}