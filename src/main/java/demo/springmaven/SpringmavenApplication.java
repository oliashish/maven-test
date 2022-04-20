package demo.springmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  


@SpringBootApplication
public class SpringmavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmavenApplication.class, args);
	}

}

@RestController  
class HelloWorldController   
{  
@RequestMapping("/")  
public String hello()   
{  
return "Hello world";  
}  
}  