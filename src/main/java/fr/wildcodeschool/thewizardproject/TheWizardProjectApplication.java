package fr.wildcodeschool.thewizardproject;

import fr.wildcodeschool.thewizardproject.controllers.App;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheWizardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWizardProjectApplication.class, args);
		App myapp = new App();
		myapp.start();
	}
}
