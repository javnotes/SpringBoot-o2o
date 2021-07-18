package cn.vuffy.o2o.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * 对标 spring-service 里面的 transactionManager
 * 继承 TransactionManagementConfigurer 是因为开启 annotation-driven
 */
@Configuration
// 首先使用注解 @EnableTransactionManagement 开启事务支持后
// 在Service方法上添加注解 @Transactional 便可
@EnableTransactionManagement
public class TransactionManagementConfiguration implements TransactionManagementConfigurer {

    @Autowired
    // 注入 DataSourceConfiguration 里边的 dataSource
    // 通过 createDataSource() 获取
    private DataSource dataSource;

    @Override
    /**
     * 关于事务管理，需要返回 PlatformTransactionManager 的实现
     */
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
