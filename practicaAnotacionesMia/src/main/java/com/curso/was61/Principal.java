package com.curso.was61;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.was61.beans.Persona;

public class Principal {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        System.out.println("Contexto cargado");
        Persona p = ctx.getBean(Persona.class);
        assert p != null : "No se encuentra la persona";
        System.out.println(p);
    }

}
