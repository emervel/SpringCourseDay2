package com.curso.spring.plantillaxml;

import beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.Log;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String... args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        if (args[0].equalsIgnoreCase("-anotaciones")) {
            System.out.println("Hook instalado");
            ((AbstractApplicationContext) ctx).registerShutdownHook();
        }
        System.out.println("Contexto cargado");
        Persona bean = ctx.getBean(Persona.class);
        System.out.println(bean);
    }
}
