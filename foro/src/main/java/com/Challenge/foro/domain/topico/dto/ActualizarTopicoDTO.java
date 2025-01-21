package com.Challenge.foro.domain.topico.dto;

import com.Challenge.foro.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
