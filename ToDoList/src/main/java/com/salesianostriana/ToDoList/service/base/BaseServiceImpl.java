package com.salesianostriana.ToDoList.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseServiceImpl<T, ID, R extends JpaRepository<T, ID>> implements BaseService<T, ID, R> {

    @Autowired
    protected R repositorio;

    @Override
    public T save(T t) {
        // TODO Auto-generated method stub
        return repositorio.save(t);
    }

    @Override
    public T findById(ID id) {
        // TODO Auto-generated method stub
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        // TODO Auto-generated method stub
        return repositorio.findAll();
    }

    @Override
    public T edit(T t) {
        // TODO Auto-generated method stub
        return repositorio.save(t);
    }

    @Override
    public void delete(T t) {
        // TODO Auto-generated method stub
        repositorio.delete(t);

    }

    @Override
    public void deleteById(ID id) {
        // TODO Auto-generated method stub
        repositorio.deleteById(id);
    }

}
