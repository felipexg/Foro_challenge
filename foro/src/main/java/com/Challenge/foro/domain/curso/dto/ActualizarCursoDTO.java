package com.Challenge.foro.domain.curso.dto;

import com.Challenge.foro.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
