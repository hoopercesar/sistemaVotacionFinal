package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.services.ElectoresServices;
import com.example.sistemaElectoralFinal.services.VotoEmitidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/electores")
@CrossOrigin(origins="http://localhost:5173")
public class ElectoresController {

    @Autowired
    private ElectoresServices electoresServices;

    @Autowired
    private VotoEmitidoServices votoEmitidoServices;


    @PostMapping
    @Transactional
    public Object saveElectores(@RequestBody Electores elector) {

        electoresServices.saveElector(elector);


        return votoEmitidoServices.getRutElector(elector);

    }

}
