package br.com.senai.recados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.recados.entity.Recado;
import br.com.senai.recados.repository.RecadoRepository;

@Service
public class RecadoService {

    @Autowired
    private RecadoRepository recadoRepository;

    // Listar os recados
    public List<Recado> findAll(){
        return recadoRepository.findAll();
    }
}
