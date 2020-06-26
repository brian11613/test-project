# test-project

基于nacos 的spring cloud 微服务项目模板。 nacos 为注册中心亦为配置中心

1. `jdk` 版本1.8
2. `maven` 版本3.0+，且需在本地setting.xml中配置好maven私服地址
3. IDEA需安装阿里巴巴开发规范插件，lombok插件

展示层，分为rest, feign, callback三个子文件夹;内部实现必须要调用biz层暴漏的spring bean
其中：
>> 1. rest文件夹代表给H5前端，或者APP客户端提供的接口，其中类名以Controller结尾; 
>> 2. feign文件夹内代表提供给其它子系统的feign接口，类名以FeignControler结尾; 
>> 3. callback文件夹内提供给三方系统的回调接口，类名以CallbackController结尾

业务逻辑抽象层，接口名以Service结尾，类名以ServiceImpl结尾；内部实现是调用manager层暴露的spring bean

业务逻辑层，分为impl, mq, schedule三个子文件夹;
其中：
>> 1. impl是代表业务逻辑的实现类，类名以ManagerImpl结尾，内部实现必须要调用dal层暴漏的spring bean；
>> 2. mq文件夹包含了发送MQ消息的bean，接收MQ消息的bean；
>> 3. schedule文件夹代表定时任务，里面的类名以Job结尾

数据库层，分为entity, mapper2个文件夹，分表包含了数据库实体和mybatis的mapper接口
**注意：**
>>1. `mybatis-generator`插件使用需在根目录下，执行`mvn mybatis-generator:generate`
>>2. service层调用dal层时，对生成类Example的使用可参考[Mybatis-Generator生成类Exmaple使用文档](http://confluence.infra.miyatech.com/pages/viewpage.action?pageId=5177490)
>>3. 分页插件用的是Mybatis的PageHelper插件，使用的是springboot集成版的

调用集成层，分为facade，rest2个文件夹，其中：
>> 1. facade文件夹包含了调用内部系统的spring bean, 实现类以FacadeClientImp结尾，接口以FacadeClient结尾（调用feign接口）
>> 2. rest文件夹包含了调用三方系统的spring bean，实现类以RestClientImpl结尾，接口以RestClient结尾

配置层，包含了各个依赖组件自动创建bean的配置类，初步包含了db, redis, swagger文件夹
>>1. db文件夹中包含了数据库层bean的初始化
>>2. redis文件夹中包含了Redis相关的bean初始化
>>3. swagger 文件夹中包含了swagger 配置：扫描的baise_package, swagger的可用profile
>>4. <span style="color:blue; font-weight: bolder"> 若需使用自定义配置类（properties）,可自行创建 property文件夹，类名以Property结尾。</span>

资源文件层，包含了bootstrap-${profile}.yml，日志配置文件logback-spring.xml以及mybatis的sql的xml文件

**注意**：线上环境和测试环境启动时都需指定profile，分别会使用`bootstrap-prod.yml`，`bootstrap-test.yml`，本地开发无需配置，默认会使用`bootstrap-default.yml`或`bootstrap.yml`
指定profile:
``` 
java -jar test-project-run.jar -Dspring.profiles.active=prod
```



