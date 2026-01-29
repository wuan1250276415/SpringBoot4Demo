package dev.wuan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 👇 加上这一行 "炸弹"
		if (true) {
			throw new RuntimeException("💥 这是一个用于测试回滚的人工炸弹！");
		}

		SpringApplication.run(DemoApplication.class, args);
	}

}
