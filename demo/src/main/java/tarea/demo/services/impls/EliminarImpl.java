package tarea.demo.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import tarea.demo.models.dto.EliminarDTO;
import tarea.demo.repositories.EliminarRepository;
import tarea.demo.services.EliminarService;

import javax.annotation.PostConstruct;

public class EliminarImpl implements EliminarService {

    @Autowired
    EliminarRepository eliminarRepository;

    @PostConstruct
    private void initDataBase(){

        long firstId = eliminarRepository.findAll().iterator().next().getId();
        eliminarRepository.deleteById(firstId);
        System.out.println(eliminarRepository.count());

    }

    @Override
    public EliminarDTO deleteById(int id) {
        return null;
    }
}
