package com.salesianostriana.ToDoList.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String password;

}
