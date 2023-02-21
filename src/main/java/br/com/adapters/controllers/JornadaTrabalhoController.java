package br.com.adapters.controllers;

import br.com.adapters.dtos.JornadaTrabalhoDto;
import br.com.adapters.mappers.JornadaTrabalhoMapper;
import br.com.application.domain.JornadaTrabalho;
import br.com.application.ports.JornadaTrabalhoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jornada-trabalho")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JornadaTrabalhoController {

    @Inject
    JornadaTrabalhoService jornadaService;

    @Inject
    JornadaTrabalhoMapper jornadaMapper;

    @POST
    @Path("/calcular-saida")
    //@Transactional
    public Response calculaHorarioSaida(JornadaTrabalhoDto dto) {
        JornadaTrabalho jornadaRetornada = jornadaService.calcularHorarioDeSaida(jornadaMapper.toResource(dto));
        return Response.ok(jornadaMapper.toResource(jornadaRetornada)).status(200).build();
    }


}