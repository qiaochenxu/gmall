package com.personage.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.personage.gmall.bean.UmsMember;
import com.personage.gmall.bean.UmsMemberReceiveAddress;
import com.personage.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 乔晨旭
 * @BelongsProject: gmall
 * @BelongsPackage: com.personage.gmall.user.controller
 * @CreateTime: 2020-07-23 17:11
 * @Description:
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;


    @RequestMapping("index")
    public String index(){
        return "hello user";
    }
    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){
       List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("selectAll/{memberId}")
    public List<UmsMemberReceiveAddress> selectAll(@PathVariable Integer memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.selectAll(memberId);
    return umsMemberReceiveAddresses;
    }



}
