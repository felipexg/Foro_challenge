package com.Challenge.foro.domain.respuesta.validations.update;

import com.Challenge.foro.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
