package com.bishe.domain;

import com.feinno.framework.common.domain.AbstractEntity;

import javax.persistence.*;

/**
 * Created by shuaigehong on 2015/12/20.
 */
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    private Long id;
    private String userName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
