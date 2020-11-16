package com.personage.gmall.user.service.impl;

import com.personage.gmall.bean.UmsMember;
import com.personage.gmall.bean.UmsMemberReceiveAddress;
import com.personage.gmall.service.UserService;
import com.personage.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.personage.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 乔晨旭
 * @BelongsProject: gmall
 * @BelongsPackage: com.personage.gmall.user.service.impl
 * @CreateTime: 2020-07-23 17:12
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll(); //userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> selectAll(Integer memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return select;
    }


}
