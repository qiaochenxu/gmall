package com.personage.gmall.user.mapper;

import com.personage.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 乔晨旭
 */
//@Mapper
public interface UserMapper extends Mapper<UmsMember> {
    //List<UmsMember> selectAllUser();
}
