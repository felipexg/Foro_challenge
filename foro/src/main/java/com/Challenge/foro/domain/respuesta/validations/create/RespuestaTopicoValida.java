package com.Challenge.foro.domain.respuesta.validations.create;

import  com.Challenge.foro.domain.respuesta.dto.CrearRespuestaDTO;
import com.Challenge.foro.domain.topico.Estado;
import com.Challenge.foro.domain.topico.repository.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopicoValida implements ValidarRespuestaCreada{

    @Autowired
    private TopicoRepository repository;

    @Override
    public void validate(CrearRespuestaDTO data) {
        var topicoExiste = repository.existsById(data.topicoId());

        if (!topicoExiste){
            throw new ValidationException("Este topico no existe.");
        }

        var topicoAbierto = repository.findById(data.topicoId()).get().getEstado();

        if(topicoAbierto != Estado.OPEN){
            throw new ValidationException("Este topico no esta abierto.");
        }

    }
}