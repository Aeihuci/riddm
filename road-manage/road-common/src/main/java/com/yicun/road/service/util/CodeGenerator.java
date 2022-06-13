package com.yicun.road.service.util;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: CodeGenerator
 * @Description:
 * @Author: gary
 * @Date: 2022/6/13 11:28
 * @Version 1.0
 **/
public class CodeGenerator {
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StrUtil.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    /**
     * RUN THIS
     */
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
      //  final String projectPath = System.getProperty("user.dir");
        final String projectPath = "D:\\WORK\\YICUN\\CODE\\road-manage\\road-manage\\road-common";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("gary");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();

        dsc.setUrl("jdbc:mysql://192.168.131.133:3306/riddm_test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true&useAffectedRows=true&nullCatalogMeansCurrent=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("riddm");
        dsc.setPassword("riddm123");
        mpg.setDataSource(dsc);

        // 包配置
        final PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("模块名"));
        pc.setParent("com.yicun.road.service");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "D:\\WORK\\YICUN\\CODE\\road-manage\\road-manage\\road-service\\src\\main\\resources\\mapper\\"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController(null);
        templateConfig.setService(null);
        templateConfig.setServiceImpl(null);
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // strategy.setSuperEntityClass("com.sunny.order.pojo.BaseEntity");
        strategy.setEntityLombokModel(true);
        //strategy.setSuperControllerClass("com.sunny.order.controller.BaseController");
        strategy.setInclude(scanner("表名"));
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        //strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
