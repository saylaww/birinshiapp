package uz.nukuslab.birinshiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BirinshiappApplication {

    @GetMapping("/")
    public String index(){
        return "TEST page 111";
    }

    public static void main(String[] args) {
        SpringApplication.run(BirinshiappApplication.class, args);
    }

}
