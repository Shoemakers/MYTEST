package ph.mallody.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sohu.idcenter.IdWorker;

@Configuration
public class IdWorkerConfig {

	@Bean
	public IdWorker idWorker() {
		//IdWorker(long workerId, long datacenterId, long sequence)
		//参数1：机器编号 参数2：数据中心编号 参数3：序列起始值
		//如果有需要多个数据服务生成id则需要配置不同的机器编号及数据中心编号
		//在不同的服务中使用IDWorker最好设置不同的数据中心编号，也就是第二个参数值
		IdWorker idWorker = new IdWorker(1, 2, 0);
		return idWorker;
	}
}
