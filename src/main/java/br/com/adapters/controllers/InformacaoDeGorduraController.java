package br.com.adapters.controllers;

import br.com.adapters.dtos.JornadaTrabalhoDto;
import br.com.application.domain.InformacaoDeGordura;
import br.com.application.ports.InformacaoDeGorduraService;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/gorduras")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InformacaoDeGorduraController {

    @Inject
    InformacaoDeGorduraService informacaoDeGorduraService;

    //@Inject
    //InformacaoDeGorduraMapper informacaoDeGorduraMapper;

    @GET
    public Response findAll(JornadaTrabalhoDto dto) {
        List<InformacaoDeGordura> gorduras = informacaoDeGorduraService.findAll();
        return Response.ok(gorduras).status(200).build();
    }


}