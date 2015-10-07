package com.curso.was62;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.was62.beans.Persona;

public class Principal {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
		System.out.println("Contexto cargado");
		Persona p = ctx.getBean(Persona.class);
		System.out.println(p);
	}

}
