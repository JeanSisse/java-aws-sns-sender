package br.com.jean.app;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jean.app.aws.sns.service.SNSService;

@SpringBootApplication
public class JavaAwsSnsApplication {

	public static void main(String[] args) {
		SNSService.sendMessage("Uma mensagem enviada através da aplicação Java - " + LocalDate.now());
//		SpringApplication.run(JavaAwsSnsApplication.class, args);
	}

}
