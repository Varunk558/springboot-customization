package com.sbc;

import com.sbc.beans.Truck;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SBCApplication {
    public static void main(String[] args) {
//        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SBCApplication.class);
//        springApplicationBuilder.bannerMode(Banner.Mode.OFF);
//        SpringApplication springApplication = springApplicationBuilder.build();
//        ApplicationContext applicationContext = springApplication.run(args);
        ApplicationContext applicationContext = SpringApplication.run(SBCApplication.class, args);
        Truck truck = applicationContext.getBean(Truck.class);

    }

}
