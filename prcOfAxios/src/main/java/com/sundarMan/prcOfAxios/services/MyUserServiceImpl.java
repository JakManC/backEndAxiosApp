package com.sundarMan.prcOfAxios.services;

import com.sundarMan.prcOfAxios.model.MyUser;
import com.sundarMan.prcOfAxios.repositories.MyUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MyUserServiceImpl implements MyUserService{
    private final MyUserRepo myUserRepo;

    public MyUserServiceImpl(MyUserRepo myUserRepo){
        this.myUserRepo=myUserRepo;

    }

    @Override
    public MyUser regUser(MyUser myUser) {
        return myUserRepo.save(myUser);
    }

    @Override
    public List<MyUser> getAllByS() {
        return myUserRepo.findAll();
    }
}
