package com.app.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
		Assert.hasText("hello","hello");
	}

}
