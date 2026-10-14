package br.com.senai.infoa.backend.projeto_empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "pc gamer",
        version = "1.0",
        description = "API para a compra de um pc gamer de 129 bilhões de euros cubicos"
    )
)
public class Swagger {

}