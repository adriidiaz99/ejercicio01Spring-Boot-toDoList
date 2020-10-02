package com.salesianostriana.ToDoList;

import com.salesianostriana.ToDoList.model.Tarea;
import com.salesianostriana.ToDoList.service.TareaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(TareaService servicioTarea){
		return args -> {
			servicioTarea.save(Tarea.builder().nombre("Hellow").fechaCreacion(LocalDate.now()).fechaCaducidad(LocalDate.now()).build());

		};
	}

}
