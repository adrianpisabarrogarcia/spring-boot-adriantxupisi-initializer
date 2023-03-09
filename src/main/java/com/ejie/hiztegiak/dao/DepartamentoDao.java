package com.ejie.hiztegiak.dao;

import com.ejie.hiztegiak.entity.Departamento;
import java.util.List;

public interface DepartamentoDao {


    //Find all
    public List<Departamento> findAll();

    //Find by id
    public Departamento findById(int id);

    //Add
    public Departamento add(Departamento departamento);

    //Save
    public Departamento save(Departamento departamento);

    //Update
    public Departamento update(Departamento departamento);

    //Delete by id
    public boolean deleteById(int id);

    //Delete all
    public boolean deleteAll();


}
