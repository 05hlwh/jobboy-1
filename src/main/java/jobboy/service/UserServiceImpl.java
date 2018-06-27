package jobboy.service;

import jobboy.mapper.UsertMapper;
import jobboy.po.Usert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsertMapper userMapper;
    @Override
    public boolean registe(Usert user) {
        int n=userMapper.insert(user);
        if(n==0)
            return false;
        return true;
    }
}
