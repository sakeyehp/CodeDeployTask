package com.sha.codedeploytask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CodeDeployTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeDeployTaskApplication.class, args);
	}

}

@RestController
class Hello {

    @RequestMapping("/geostore/rest")
    String index() {
        return "This is a bootstrapped sample site using start.spring.io to demo the Geostore example";
    }
}