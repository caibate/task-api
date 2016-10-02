package com.taks.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.taks.api.entity.Task;
import com.taks.api.repository.TaskRepository;

@SpringBootApplication
public class TaskApiApplication {
	private static final Logger log = LoggerFactory.getLogger(TaskApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaskApiApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner demo(TaskRepository repository) {
//		return (args) -> {
//			//salva as Tasks
//			repository.save(new Task("Arrumar a casa", 50));
//			repository.save(new Task("Fazer comida", 100));
//			repository.save(new Task("Estudar", 70));
//			
//			// fetch all customers
//			log.info("Tasks found with findAll():");
//			log.info("-------------------------------");
//			for (Task task: repository.findAll()) {
//				log.info(task.toString());
//			}
//            log.info("");
//
//			// fetch an individual customer by ID
//			Task task1 = repository.findOne(1);
//			log.info("Task1 found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(task1.toString());
//            log.info("");
//
//
//		};
//	}
}
