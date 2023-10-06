package com.utn.Api_Sin_Paginacion.Services;

import com.utn.Api_Sin_Paginacion.Entities.Persona;
import com.utn.Api_Sin_Paginacion.Repositories.BaseRepository;
import com.utn.Api_Sin_Paginacion.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

}
