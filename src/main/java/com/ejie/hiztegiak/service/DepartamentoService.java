package com.ejie.hiztegiak.service;

import com.ejie.hiztegiak.entity.Departamento;

import java.util.List;

public interface DepartamentoService {

    public List<Departamento> findAll();

    public Departamento findById(int id);

    public Departamento add(Departamento departamento);

    public Departamento save(Departamento departamento);

    public Departamento update(Departamento departamento);

    public boolean deleteById(int id);

    public boolean deleteAll();


}
