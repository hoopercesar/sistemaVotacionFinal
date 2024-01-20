package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.services.ElectoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/electores")
@CrossOrigin(origins="http://localhost:5173")
public class ElectoresController {

    @Autowired
    private ElectoresServices electoresServices;

    @GetMapping
    public List<Electores> getAll() {
        return electoresServices.getElectores();
    }

    @PostMapping
    public void saveElectores(@RequestBody Electores elector) {
        electoresServices.saveElector(elector);
    }

}
