package br.com.adapters.dtos;

import lombok.Data;

@Data
public class JornadaTrabalhoDto {

    //Dados Entrada
    private String horasPadrao;
    private String horasCompensaveis;
    private String horaEntrada;
    private String horaSaidaAlmoco;
    private String horaRetornoAlmoco;

    //Dados Saída
    private String horaSaida;
}
