package com.Challenge.foro.infra.sprintdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("peapers-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP)
                                        .scheme("peapers").bearerFormat("JWT")));

    }
}
