package br.com.application.services;


import br.com.application.domain.JornadaTrabalho;
import br.com.application.ports.JornadaTrabalhoService;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.SECONDS;


public class JornadaTrabalhoServiceImpl implements JornadaTrabalhoService {

    public JornadaTrabalho calcularHorarioDeSaida(JornadaTrabalho jornadaTrabalho) {

        //Tempo da primeira jornada de trabalho
        LocalTime primeiraJornada = subtrairLocalTime(jornadaTrabalho.getHoraEntrada(), jornadaTrabalho.getHoraSaidaAlmoco());

        //Saldo devedor do dia
        LocalTime saldoDevedorDia = subtrairLocalTime(jornadaTrabalho.getHorasCompensaveis(), jornadaTrabalho.getHorasPadrao());

        //Tempo Restante de trabalho
        Long tempoRestanteTrabalho = subtrairPeriodosEmLocalTime(primeiraJornada, saldoDevedorDia);
        //Calcular horario de Saida
        Long retornoAlmocoSegundos = converterLocalTimeEmSegundos(jornadaTrabalho.getHoraRetornoAlmoco());
        Long horarioSaidaSugerido = somarPeriodosEmSegundos(tempoRestanteTrabalho, retornoAlmocoSegundos);

        jornadaTrabalho.setHoraSaida(converterSegundosEmLocalTime(horarioSaidaSugerido));

        return jornadaTrabalho;
    }

    private Long somarPeriodosEmSegundos(Long primeiroPeriodo, Long SegundoPeriodo) {
        return primeiroPeriodo + SegundoPeriodo;
    }

    private Long subtrairPeriodosEmLocalTime(LocalTime primeiroPeriodo, LocalTime SegundoPeriodo) {

        return SECONDS.between(primeiroPeriodo, SegundoPeriodo);
    }

    private LocalTime converterSegundosEmLocalTime(Long segundos) {

        return LocalTime.ofSecondOfDay(segundos);
    }

    private Long converterLocalTimeEmSegundos(LocalTime localTime) {

        return Long.parseLong(String.valueOf(localTime.toSecondOfDay()));
    }


    private LocalTime subtrairLocalTime(LocalTime primeiroLocalTime, LocalTime segundoLocalTime) {
        Long localTime = SECONDS.between(primeiroLocalTime, segundoLocalTime);
        return converterSegundosEmLocalTime(localTime);
    }


}
