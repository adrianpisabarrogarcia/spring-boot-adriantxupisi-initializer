package com.ejie.hiztegiak.service;

import com.ejie.hiztegiak.dao.DepartamentoDao;
import com.ejie.hiztegiak.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao departamentoDao;

    @Override
    public List<Departamento> findAll() {
        return departamentoDao.findAll();
    }

    @Override
    public Departamento findById(int id) {
        return departamentoDao.findById(id);
    }

    @Override
    public Departamento add(Departamento departamento) {
        return departamentoDao.add(departamento);
    }

    //⚠️ Atención!
    //Este método no es necesario, ya que se puede usar el método add
    //Aunque se podría usar para hacer un update
    //Si el id es 0, se crea un nuevo registro
    //Si el id es mayor que 0, se actualiza el registro
    //Si no se encuentra el registro, se crea uno nuevo, pero no te lo devuelve
    @Override
    public Departamento save(Departamento departamento) {
        return departamentoDao.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoDao.update(departamento);
    }

    @Override
    public boolean deleteById(int id) {
        return departamentoDao.deleteById(id);
    }

    @Override
    public boolean deleteAll() {
        return departamentoDao.deleteAll();
    }

}
