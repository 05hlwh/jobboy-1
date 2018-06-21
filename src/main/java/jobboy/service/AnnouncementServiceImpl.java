package jobboy.service;


import jobboy.mapper.AnnouncementMapper;
import jobboy.po.Announcement;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    AnnouncementMapper mapper;
    @Override
    @Transactional
    public String getContent(String id) {
        Announcement announcement=mapper.selectByPrimaryKey(Integer.valueOf(id));
        return announcement.getAnContent();
    }
}
