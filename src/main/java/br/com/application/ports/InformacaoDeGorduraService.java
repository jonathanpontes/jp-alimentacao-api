package br.com.application.ports;

import br.com.application.domain.InformacaoDeGordura;

import java.util.List;

public interface InformacaoDeGorduraService {

    List<InformacaoDeGordura> findAll();
}
