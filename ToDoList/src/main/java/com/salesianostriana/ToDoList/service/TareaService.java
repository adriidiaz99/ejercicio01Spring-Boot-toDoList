package com.salesianostriana.ToDoList.service;

import com.salesianostriana.ToDoList.model.Tarea;
import com.salesianostriana.ToDoList.repository.TareaRepository;
import com.salesianostriana.ToDoList.service.base.BaseServiceImpl;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class TareaService extends BaseServiceImpl<Tarea, Long, TareaRepository> {



}
