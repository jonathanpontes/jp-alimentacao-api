package br.com.application.ports;

import br.com.application.domain.JornadaTrabalho;

public interface JornadaTrabalhoService {
    JornadaTrabalho calcularHorarioDeSaida(JornadaTrabalho jornadaTrabalho);
}
