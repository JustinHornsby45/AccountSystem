package za.ac.nwu.ac.web.sb.exception;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.ac.nwu.ac.domain.service.GeneralResponse;

@SpringBootApplication

public class RestServiceApplication{
    public static void main(String[] args){
        SpringApplication.run(RestServiceApplication.class, args);
    }


}
