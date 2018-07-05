package com.newland.iot;

import com.newland.iot.dao.DeviceInfoMapper;
import com.newland.iot.model.DeviceInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author zk
 * @create 2018/7/5
 */
@SpringBootApplication
@MapperScan("com.newland.iot.dao")
public class MybatisTestApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(MybatisTestApplication.class, args);
        DeviceInfoMapper deviceInfoMapper = (DeviceInfoMapper) applicationContext.getBean("deviceInfoMapper");
        DeviceInfo deviceInfo=deviceInfoMapper.selectByPrimaryKey(100000000346L);
        System.out.println(deviceInfo.toString());
    }
}
