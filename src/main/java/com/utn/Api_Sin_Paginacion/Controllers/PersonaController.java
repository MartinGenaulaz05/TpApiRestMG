package com.utn.Api_Sin_Paginacion.Controllers;

import com.utn.Api_Sin_Paginacion.Entities.Autor;
import com.utn.Api_Sin_Paginacion.Entities.Persona;
import com.utn.Api_Sin_Paginacion.Services.AutorServiceImpl;
import com.utn.Api_Sin_Paginacion.Services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {
}
