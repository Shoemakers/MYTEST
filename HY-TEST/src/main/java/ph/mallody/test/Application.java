package ph.mallody.test;

import java.util.concurrent.CountDownLatch;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
@MapperScan({"ph.mallody.test.mapper"})
@EnableTransactionManagement
public class Application {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}
	
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext = new SpringApplicationBuilder()
				.sources(Application.class)
				//把项目设置成非web环境
				.web(false)
				.run(args);
		System.out.println("HY-TEST 启动了");

		//阻塞线程，是系统处于运行状态
		CountDownLatch countDownLatch = applicationContext.getBean(CountDownLatch.class);
		countDownLatch.await();
	}
}
