package cn.vuffy.o2o.service;

import cn.vuffy.o2o.dto.LocalAuthExecution;
import cn.vuffy.o2o.entity.LocalAuth;
import cn.vuffy.o2o.exceptions.LocalAuthOperationException;

public interface LocalAuthService {

    /**
     * 通过账号名+密码获取平台账号信息
     *
     * @param username
     * @param password
     * @return
     */
    LocalAuth getLocalAuthByUsernameAndPwd(String username, String password);

    /**
     * 通过userId获取平台账号信息
     *
     * @param userId
     * @return
     */
    LocalAuth getLocalAuthByUserId(Long userId);

    /**
     * 绑定微信，生成平台账号
     *
     * @param localAuth
     * @return
     * @throws LocalAuthOperationException
     */
    LocalAuthExecution bindLocalAuth(LocalAuth localAuth) throws LocalAuthOperationException;

    /**
     * 修改平台账号密码
     * @param userId
     * @param username
     * @param password
     * @param newPassword
     * @return
     * @throws LocalAuthOperationException
     */
    LocalAuthExecution modifyLocalAuth(Long userId, String username, String password, String newPassword)
            throws LocalAuthOperationException;
}
