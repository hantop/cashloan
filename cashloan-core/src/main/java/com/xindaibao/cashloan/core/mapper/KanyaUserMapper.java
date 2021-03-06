package com.xindaibao.cashloan.core.mapper;

import com.xindaibao.cashloan.core.model.*;
import com.xindaibao.cashloan.core.common.mapper.BaseMapper;
import com.xindaibao.cashloan.core.common.mapper.RDBatisDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@RDBatisDao
public interface KanyaUserMapper extends BaseMapper<KanyaUser, Long> {

    KanyaUserLocation getBaseModelByUserId(Long userId);

    List<KanyaUser> findByPrimary(Map<String, Object> params);

    KanyaUser findById(Long id);

    int updateUserState(Map<String, Object> params);

    int selectRegisteredCount();
    List<KanyaUser> queryInvited(@Param("inviteCode") String inviteCode);//邀请人信息查询
    //添加用户
    int save(KanyaUser kanyaUser);
    //通过手机号查询用户
    KanyaUser findByMobile(String mobile);
    //添加黑名单
    void addBlackList(Long id);

    int saveUsers(List<KanyaUser> list);
    List completeUserInfo();

    void callAble();
}