package service.template;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class ServiceTemplateApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ServiceTemplateApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}


//	@Bean
//	public ModelMapper modelMapper(){
//		return new ModelMapper();
//	}

}
