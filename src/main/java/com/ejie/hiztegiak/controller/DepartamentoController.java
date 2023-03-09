package com.ejie.hiztegiak.controller;

import com.ejie.hiztegiak.entity.Departamento;
import com.ejie.hiztegiak.service.DepartamentoService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    Logger logger = LoggerFactory.getLogger(DepartamentoController.class);

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    //Find all
    @GetMapping("/findAll")
    public List<Departamento> findAll() {
        //Ejemplo de traza
        logger.info("Traza controller: " + departamentoService.findAll().toString());
        return departamentoService.findAll();
    }

    //Find by id
    @GetMapping("/findById/{id}")
    public Departamento findById(@PathVariable int id) {
        return departamentoService.findById(id);
    }

    //Find by id 2
    @GetMapping("/findByIdRequestParam")
    public Departamento findByIdRequestParam(@RequestParam int id) {
        return departamentoService.findById(id);
    }

    //Add
    @PostMapping("/add")
    public Departamento add(@RequestBody Departamento departamento) {
        return departamentoService.add(departamento);
    }

    //Save
    @PostMapping("/save")
    public Departamento save(@RequestBody Departamento departamento) {
        return departamentoService.save(departamento);
    }

    //Update
    @PostMapping("/update")
    public Departamento update(@RequestBody Departamento departamento) {
        return departamentoService.update(departamento);
    }

    //Delete by id
    @GetMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable int id) {
        return departamentoService.deleteById(id);
    }

    //Delete all
    @GetMapping("/deleteAll")
    public boolean deleteAll() {
        return departamentoService.deleteAll();
    }




}
