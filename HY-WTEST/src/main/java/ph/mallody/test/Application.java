package ph.mallody.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class Application {

  public static void main(String[] args) {
      //启动工程，使用SpringApplication的run方法
      SpringApplication.run(Application.class, args);
  }
  
}
