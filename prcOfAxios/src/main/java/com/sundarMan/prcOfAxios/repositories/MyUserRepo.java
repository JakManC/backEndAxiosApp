package com.sundarMan.prcOfAxios.repositories;

import com.sundarMan.prcOfAxios.model.MyUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends MongoRepository<MyUser, String > {
}
