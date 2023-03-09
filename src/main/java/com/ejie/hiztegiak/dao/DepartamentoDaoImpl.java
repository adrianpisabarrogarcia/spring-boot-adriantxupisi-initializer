package com.ejie.hiztegiak.dao;

import com.ejie.hiztegiak.entity.Departamento;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DepartamentoDaoImpl implements DepartamentoDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Departamento> findAll() {
        return entityManager.createQuery("from Departamento").getResultList();
    }

    @Override
    public Departamento findById(int id) {
        return entityManager.find(Departamento.class, id);
    }

    @Transactional
    public Departamento add(Departamento departamento) {
        entityManager.persist(departamento);
        return departamento;
    }

    @Transactional
    public Departamento save(Departamento departamento) {
        entityManager.merge(departamento);
        return departamento;
    }

    @Transactional
    public Departamento update(Departamento departamento) {
        entityManager.merge(departamento);
        return departamento;
    }

    @Transactional
    public boolean deleteById(int id) {
        Departamento departamento = findById(id);
        entityManager.remove(departamento);
        return true;
    }

    @Transactional
    public boolean deleteAll() {
        entityManager.createQuery("delete from Departamento").executeUpdate();
        return true;
    }

}
