#spring-cloud学习及应用demo
欢迎随时探讨！`jiangyx5@163.com`
## eureka高可用架构
#### 高可用注册中心集群
只需要增加Eureka服务器注册URL
``` yml
eureka:
  client:
    serviceUrl:
      defaultZone:
        http://localhost:9090/eureka/,http://localhost:9091/eureka/
```
如果Eureka客户端应用配置多个Eureka注册中心服务器，那么默认情况只有第一台可用的服务器，存在注册信息。
如果第一台可用的Eureka服务器Down掉了，那么Eureka客户端应用将会选择下一台可用的Eureka服务器。