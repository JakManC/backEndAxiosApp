package com.sundarMan.prcOfAxios.services;

import com.sundarMan.prcOfAxios.model.MyUser;
import com.sundarMan.prcOfAxios.repositories.MyUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MyUserService {

    MyUser regUser(MyUser myUser);

    List<MyUser> getAllByS();
}
