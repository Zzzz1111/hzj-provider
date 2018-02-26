package com.huzijun.hzjprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huzijun.hzjprovider.provider.mapper")
public class HzjProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzjProviderApplication.class, args);
		}
}
