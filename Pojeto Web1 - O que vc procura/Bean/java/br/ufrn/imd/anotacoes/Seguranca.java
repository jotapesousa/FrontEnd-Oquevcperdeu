package br.ufrn.imd.anotacoes;

import br.ufrn.imd.dominio.Perfil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.TYPE, ElementType.METHOD})
public @interface Seguranca {
    Perfil perfil() default Perfil.CONSULTA;

}
