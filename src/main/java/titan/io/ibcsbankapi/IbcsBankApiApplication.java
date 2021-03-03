package titan.io.ibcsbankapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IbcsBankApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbcsBankApiApplication.class, args);
        System.out.println("Welcome to IBCS-Bank-API Java version.");
    }
}
