# primo-dubbo-swagger 
 
项目地址：


# primo-dubbo-swagger 

## 说明  
每次项目启动时生成http接口请求项目dubbo接口  
开发/测试可以直接在页面上进行请求http接口进行dubbo接口测试  
基于swagger提供了一套比较美观简洁的UI界面   

## 版本更新说明 

### 0.1.0-SNAPSHOT
1. 解决类中方法重名获取的bug（会获取到私有方法）    

### 0.0.7-SNAPSHOT
1. 将方法枚举ApiMethod中的参数枚举ApiParam进行修改，ApiParam中的name属性定义为选填
2. fix：解决返回数据是基本类型，无法转换为JSON的报错 
3. 页面返回数据结构为：
```json
{
  "code": "200",
  "type": "java.lang.String",
  "returnData": null
}
```
其中returnData为实际请求方法返回的数据，兼容null值的返回  


### 0.0.6-SNAPSHOT
1. 新增wiki.primo.dubbo.swagger.api.ApiParam注解。注解中增加enumClass属性，在方法参数中用来标志枚举值,方便生成文档自动带上枚举说明 
2. 新增wiki.primo.dubbo.swagger.api.ApiModelProperty注解
   注解中增加enumClass属性，在类参数中用来标志枚举值,方便生成文档Model自动带上枚举说明，注意，需要配合enumAttributeName属性进行配置。  
   如果配置了enumClass，务必配置enumAttributeName  
  该值对应着allowableValues的值，也就是要填写的枚举的名称  
  例如，枚举中有name和value属性。需要传的值是value属性。  
  则该值为"value"字符串   
   枚举类：  
![08160937_LahFbL](http://blogimg.chenhaoxiang.cn/uPic/202105/08160937_LahFbL.jpg)  

   代码中的配置：  
![08161001_HIr7AN](http://blogimg.chenhaoxiang.cn/uPic/202105/08161001_HIr7AN.jpg)  

   页面实际效果：  
![08161011_NYUFjD](http://blogimg.chenhaoxiang.cn/uPic/202105/08161011_NYUFjD.jpg)  





### 0.0.5-SNAPSHOT
1. wiki.primo.dubbo.swagger.api.ApiMethod注解增加version属性，表明方法在某个版本有改动  
2. fix：模型数据实体出现异常情况

## 使用  
项目的dubbo API层依赖：  
```xml
<!--dubbo文档依赖-->
<dependency>
    <groupId>wiki.primo.dubbo</groupId>
    <artifactId>primo-dubbo-swagger-api</artifactId>
    <version>版本号</version> 
</dependency>
```
项目的server层（Tomcat启动模块）依赖：
```xml
<dependency>
    <groupId>wiki.primo.dubbo</groupId>
    <artifactId>primo-dubbo-swagger-core</artifactId>
    <version>版本号</version>
</dependency>
```
项目的server层增加swagger启用类，使用EnableSwaggerMore注解，开启ResourceConfig.class, SwaggerConfig.class的注入    
```java
@Configuration
@EnableSwaggerMore
@EnableWebMvc
@Conditional(value = SwaggerStart.SwaggerCondition.class)
public class SwaggerConfig {
}
```
项目的server层增加配置：
```properties
primo.dubbo.swagger.enable=true
```
primo.dubbo.swagger.enable的值为布尔类型，表示是否开启dubbo的swagger页面与文档   

在项目API中，使用wiki.primo.dubbo.swagger.api.ApiMethod注解，对于方法进行标注  


访问地址：
http://ip:port/swagger-ui.html  
例如：http://localhost:8082/swagger-ui.html  

swagger-ui.html为固定路径，暂不支持自定义  
注意：地址不能带项目名称  

## 演示使用的项目 
primo-dubbo-swagger-test  

## 访问演示图   
dubbo的API类：  
![08160842_HaUgO2](http://blogimg.chenhaoxiang.cn/uPic/202105/08160842_HaUgO2.jpg)  

类的方法：  
![08160858_AKuPIl](http://blogimg.chenhaoxiang.cn/uPic/202105/08160858_AKuPIl.jpg)  

方法参数：  
![08160907_3ujfGp](http://blogimg.chenhaoxiang.cn/uPic/202105/08160907_3ujfGp.jpg)  

请求按钮与返回值：  
![08160918_r5dOLW](http://blogimg.chenhaoxiang.cn/uPic/202105/08160918_r5dOLW.jpg)  


