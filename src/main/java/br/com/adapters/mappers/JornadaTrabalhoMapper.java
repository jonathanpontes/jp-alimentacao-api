package br.com.adapters.mappers;

import br.com.adapters.dtos.JornadaTrabalhoDto;
import br.com.application.domain.JornadaTrabalho;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface JornadaTrabalhoMapper {

    JornadaTrabalho toResource(JornadaTrabalhoDto jornadaTrabalhoDto);
    JornadaTrabalhoDto toResource(JornadaTrabalho jornadaTrabalho);

}
