package com.yicun.road.service;

import com.sun.org.apache.bcel.internal.generic.LineNumberGen;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RoadServiceApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(RoadServiceApplicationStarter.class,args);
        log.info("<=======道路监测数据管理系统启动成功========>");
    }
}
