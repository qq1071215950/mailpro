package com.haojing.mailpro.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * @author jiange
 * @date 2020/6/18 10:05
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.haojing.mailpro.mbg.mapper","com.haojing.mailpro.admin.dao"})
public class MyBatisConfig {
}
