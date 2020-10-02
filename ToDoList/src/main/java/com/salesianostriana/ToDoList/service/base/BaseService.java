package com.salesianostriana.ToDoList.service.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BaseService<T,ID, R extends JpaRepository<T, ID>> {

    T save(T t);

    T findById(ID id);

    List<T> findAll();

    T edit(T t);

    void delete(T t);

    void deleteById(ID id);
}