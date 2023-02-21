package br.com.application.domain;

import java.time.LocalTime;

public class JornadaTrabalho {

    private LocalTime horasPadrao;
    private LocalTime horasCompensaveis;

    private LocalTime horaEntrada;
    private LocalTime horaSaidaAlmoco;
    private LocalTime horaRetornoAlmoco;

    private LocalTime horaSaida;

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalTime getHorasPadrao() {
        return horasPadrao;
    }

    public void setHorasPadrao(LocalTime horasPadrao) {
        this.horasPadrao = horasPadrao;
    }

    public LocalTime getHorasCompensaveis() {
        return horasCompensaveis;
    }

    public void setHorasCompensaveis(LocalTime horasCompensaveis) {
        this.horasCompensaveis = horasCompensaveis;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaidaAlmoco() {
        return horaSaidaAlmoco;
    }

    public void setHoraSaidaAlmoco(LocalTime horaSaidaAlmoco) {
        this.horaSaidaAlmoco = horaSaidaAlmoco;
    }

    public LocalTime getHoraRetornoAlmoco() {
        return horaRetornoAlmoco;
    }

    public void setHoraRetornoAlmoco(LocalTime horaRetornoAlmoco) {
        this.horaRetornoAlmoco = horaRetornoAlmoco;
    }
}
