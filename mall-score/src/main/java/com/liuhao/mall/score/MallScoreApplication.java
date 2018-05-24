package com.liuhao.mall.score;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.liuhao.mall.score.mapper")
@SpringBootApplication
public class MallScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallScoreApplication.class, args);
	}
}
