package cn.vuffy.o2o.service;

import cn.vuffy.o2o.dto.WechatAuthExecution;
import cn.vuffy.o2o.entity.PersonInfo;
import cn.vuffy.o2o.entity.WechatAuth;
import cn.vuffy.o2o.enums.WechatAuthStateEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Auther: vuffy
 * Date:   2021/7/188:32 下午
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class WechatAuthServiceTest {

    @Autowired
    private WechatAuthService wechatAuthService;

    @Test
    public void testRegister() {
        // 测试：新增一条微信账号信息
        WechatAuth wechatAuth = new WechatAuth();
        PersonInfo personInfo = new PersonInfo();
        String openId = "fkkfhdk";
        // 给微信账号设置用户信息，不设置userId
        // 测试创建新微信账号信息时，自动创建平台的用户信息
        personInfo.setCreateTime(new Date());
        personInfo.setUserName("测试一下");
        personInfo.setUserType(1);
        wechatAuth.setPersonInfo(personInfo);
        wechatAuth.setOpenId(openId);
        wechatAuth.setCreateTime(new Date());
        WechatAuthExecution wechatAuthExecution = wechatAuthService.register(wechatAuth);
        assertEquals(WechatAuthStateEnum.SUCCESS.getState(), wechatAuthExecution.getState());
        // 测试：通过openId找到新增的wechatAuth
        wechatAuth = wechatAuthService.getWechatAuthByOpenId(openId);
        System.out.println(wechatAuth.getPersonInfo().getUserName());
    }
}