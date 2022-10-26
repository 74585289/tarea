package tarea.demo.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tarea.demo.services.EliminarService;

@Slf4j
@RestController

public class EliminarController {

    @Autowired
    EliminarService eliminarService;

    @DeleteMapping("/eliminar/{id}")
    void eliminarPersona(@PathVariable long id) {
        log.info("Eliminar un cliente con id" + id);
    }



}
