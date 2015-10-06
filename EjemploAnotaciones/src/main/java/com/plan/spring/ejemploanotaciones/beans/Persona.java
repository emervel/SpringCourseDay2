/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan.spring.ejemploanotaciones.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Esta clase es un ejemplo de IoC sin Inyeccion de Dependencias
 * @author usuario
 */
@Component
//@Scope("prototype") // para que no sea un Singleton
//@DependsOn(value={"uno","dos"}) // para indicar que depende de otro singleton con esos identificadores
public class Persona {

    @PostConstruct
    void f() {
    }

    @PreDestroy
    void g() {
    }
    
    @Autowired
    private Aficion aficion;
    
    //Autocableado por nombre que busca el bean con id="perfil", si no por defecto buscara uno que coincida que el nombre de la propiedad
    @Resource(name = "perfil")
    private Perfil perfil;

    @Override
    public String toString() {
        return "Persona{" + "aficion=" + aficion + ", perfil=" + perfil + '}';
    }
}
