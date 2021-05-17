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