package com.crediloco.crediloco.controller;

import com.crediloco.crediloco.dominio.Domicilio;
import com.crediloco.crediloco.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomicilioRestController {

    @Autowired
    DomicilioRepository domicilioRepository;
    
    @RequestMapping(method = GET, path = "/apirest/domicilios")
    public List<Domicilio> obtenerTodos() {

        List<Domicilio> domicilios = domicilioRepository.findAll();
        return domicilios;
        
    }

}
