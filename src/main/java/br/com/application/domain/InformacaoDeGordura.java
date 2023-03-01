package br.com.application.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="info_nutri_gord")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InformacaoDeGordura {

    //@NotBlank(message="Brand may not be blank")
    //@NotNull
    //@CreationTimestamp
    //@Column(name="horasPadrao")
    //private LocalDate modelYear;


    @Column(name = "id_alimento")
    private Integer idAlimento;

    @Column(name = "saturados_g")
    private String saturado;

    @Column(name = "monoinsaturados_g")
    private String monoInsaturados;

    @Column(name = "poliinsaturados_g")
    private String poliInsaturados;

}
