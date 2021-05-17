package vn.techmaster.demo_spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @RequestMapping("/rock")
  public String index() {
    return "Mình xin, mình đéo thích SpringBoot, cơ mà khách trả tiền";
  }

  @RequestMapping("/hello")
  public String hello() {
    return "Em chào anh chào chị ạ";
  }

}