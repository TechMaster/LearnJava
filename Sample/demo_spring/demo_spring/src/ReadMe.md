# Một số lưu ý

## Chú ý java.version setting trong pom.xml
nếu chọn JDK 1.8
```xml
<java.version>1.8</java.version>
```
đoạn code sau không biên dịch được
```java
var ctx = SpringApplication.run(DemoApplication.class, args);
```

Chuyển sang JDK 14 mới có khái niệm var
```xml
<java.version>14</java.version>
```

## Java Annotation
@SpringBootApplication có thể thay thế cho

```java
@Configuration
@EnableAutoConfiguration
@ComponentScan
```

https://beginnersbook.com/2014/09/java-annotations/