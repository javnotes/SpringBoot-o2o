package cn.vuffy.o2o.service;

import cn.vuffy.o2o.dto.WechatAuthExecution;
import cn.vuffy.o2o.entity.WechatAuth;
import cn.vuffy.o2o.exceptions.WechatAuthOperationException;

public interface WechatAuthService {

    /**
     * 通过openId查找平台中对应的微信号
     *
     * @param openId
     * @return
     */
    WechatAuth getWechatAuthByOpenId(String openId);

    /**
     * 微信账号注册至本平台
     *
     * @param wechatAuth
     * @return
     * @throws WechatAuthExecution
     */
    WechatAuthExecution register(WechatAuth wechatAuth) throws WechatAuthOperationException;
}
