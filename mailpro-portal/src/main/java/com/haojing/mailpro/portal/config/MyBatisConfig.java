package com.haojing.mailpro.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.haojing.mailpro.mbg.mapper","com.haojing.mailpro.portal.dao"})
public class MyBatisConfig {

}
