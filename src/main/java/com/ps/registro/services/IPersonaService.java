package com.ps.registro.services;

import com.ps.registro.modelo.Persona;
import org.springframework.transaction.annotation.Transactional;


public interface IPersonaService  {

    Persona guardar(Persona persona) throws Exception;

    Persona consultar(Long id) throws Exception;

    Persona actualizar(Persona persona) throws Exception;


    @Transactional()
    void borrar(Long id) throws Exception;
}