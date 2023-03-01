package br.com.adapters.repository.entity;

import br.com.application.domain.InformacaoDeGordura;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class InformacaoDeGorduraRepository implements PanacheRepository<InformacaoDeGordura> {

    public List<InformacaoDeGordura> list() {
        return listAll();
    }

}
