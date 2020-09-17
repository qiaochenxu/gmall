package com.personage.gmall.user.service;

import com.personage.gmall.user.bean.UmsMember;
import com.personage.gmall.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> selectAll(Integer memberId);
}
