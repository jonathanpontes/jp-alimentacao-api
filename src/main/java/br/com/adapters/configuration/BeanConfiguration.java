package br.com.adapters.configuration;

import br.com.application.services.JornadaTrabalhoServiceImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

public class BeanConfiguration {


    @Transactional
    @ApplicationScoped
    JornadaTrabalhoServiceImpl livrariaServiceImpl() {
        return new JornadaTrabalhoServiceImpl();
    }

}