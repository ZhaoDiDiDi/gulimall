package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心 统一管理配置
 *      1）、引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *        2）、创建一个bootstrap.properties
 *          spring.application.name=gulimall-coupon
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *        3）、需要给配置中心默认添加一个 数据集（Data Id）gulimall-coupon.properties。默认规则：应用名.properties
 *        4）、给应用名.properties添加任何配置
 *        5）、动态获取配置
 *                  @RefreshScope：动态获取并刷新配置
 *                  @Value("${配置项的属性名}")：获取到配置
 *                  如果配置中心和当前的应用配置文件配置了相同的项，优先使用配置中心的配置
 *  2、细节
 *      1）、命名空间：配置隔离；
 *              默认：public（保留空间）：默认新增的所有配置都在public空间
 *                  1、开发，测试，生产：利用命名空间来做环境隔离
 *                  注意：在bootstrap.properties；配置上说明需要使用哪个命名空间下的配置
 *                  spring.cloud.nacos.config.namespace=b5a8fd07-c38e-44f4-a73b-2c1bcad5525f
 *                  2、每个微服务之间的相互隔离，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *      2）、配置集：所有的配置的集合
 *
 *      3）、配置集ID：类似文件名。
 *              Data ID：类似文件名
 *      4）、配置分组：
 *      默认所有的配置集都属于：DEFAUL_GROUP；
 *      1111，618，1212
 *
 *      每个微服务创建自己的命名空间，使用配置分组区分环境 dev、 prop、 test
 *
 *  3、同时加载多个配置集
 *      1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *      2）、只需要在bootstrap.properties说明加载配置中心哪些配置文件即可
 *      3）、@Value、@ConfigurationProperties
 *      以前SpringBoot任何方法从配置中心文件获取值都能使用
 *      配置中心有的优先配置中心中的
 */
@EnableDiscoveryClient      //开启服务注册中心
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
