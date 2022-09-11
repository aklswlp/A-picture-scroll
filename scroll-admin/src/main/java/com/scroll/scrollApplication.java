package com.scroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author scroll
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class scrollApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(scrollApplication.class, args);
        System.out.println("Scroll启动成功");
    }
}
