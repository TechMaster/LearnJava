# Configure a Bean

Ví dụ theo sách "SpringBoot 2 Recipes" Chapter 2-1
Spring Boot will detect this class and create a bean instance from it. The @PostConstruct annotated method is invoked after construction and injection of all dependencies. Simply put, at startup the sayHello method will run and the console will print the line Hello World, from Spring Boot 2!.


## Chú ý
Chú ý phải import thư viện đầy đủ mới chạy được
bổ xung trong pom.xml
```xml
<dependency>
	<groupId>javax.annotation</groupId>
	<artifactId>javax.annotation-api</artifactId>  		
</dependency>
```

```java
package vn.techmaster.using_bean;

import org.springframework.stereotype.Component;  //Cần phải có @Component
import javax.annotation.*;  //Cần phải có cho @PostConstruct

@Component
public class HelloWorld {
  @PostConstruct
  public void sayHello() {
    System.out.println("Hello World, from Spring Boot 2!");
  }

}
```