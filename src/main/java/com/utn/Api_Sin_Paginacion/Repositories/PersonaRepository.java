package com.utn.Api_Sin_Paginacion.Repositories;

import com.utn.Api_Sin_Paginacion.Entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
