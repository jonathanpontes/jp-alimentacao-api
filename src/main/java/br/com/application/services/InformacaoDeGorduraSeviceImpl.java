package br.com.application.services;

import br.com.adapters.repository.entity.InformacaoDeGorduraRepository;
import br.com.application.domain.InformacaoDeGordura;
import br.com.application.ports.InformacaoDeGorduraService;
import com.google.inject.Inject;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class InformacaoDeGorduraSeviceImpl implements InformacaoDeGorduraService {

    @Inject
    InformacaoDeGorduraRepository repository;
    @Override
    public List<InformacaoDeGordura> findAll() {
        return repository.listAll();
    }
}
