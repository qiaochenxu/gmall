package com.personage.gmall.service;


import com.personage.gmall.bean.UmsMember;
import com.personage.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author 乔晨旭
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> selectAll(Integer memberId);

}
