package com.example.poc_swagger_gen_with_springboot.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Usuario
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-26T11:48:41.267278-03:00[America/Bahia]")

public class Usuario   {
  @JsonProperty("idUsuario")
  private Integer idUsuario = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("avatar")
  private Resource avatar = null;

  public Usuario idUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * Get idUsuario
   * @return idUsuario
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public Usuario nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(example = "Pedro Medeiros", description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Usuario avatar(Resource avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
   **/
  @Schema(description = "")
  
    @Valid
    public Resource getAvatar() {
    return avatar;
  }

  public void setAvatar(Resource avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(this.idUsuario, usuario.idUsuario) &&
        Objects.equals(this.nome, usuario.nome) &&
        Objects.equals(this.avatar, usuario.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, nome, avatar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
