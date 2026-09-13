package com.sundarMan.prcOfAxios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_coll")
public class MyUser {
    @Id
    private String id;

    private String userName;

    private int age;

    private String amb;

}
