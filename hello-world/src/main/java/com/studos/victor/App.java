package com.studos.victor;

import java.util.ArrayList;

import com.studos.victor.calculator.AppExtensions;
import com.studos.victor.domain.MusicMembers;

/**
 * Hello world!
 * 
 */
public class App extends AppExtensions {
	
	public static String callExtended() {
		return extendedMethod();
	}
	

	public static ArrayList<String> returnRockinstonesListnames() {
    	ArrayList<String> list = new ArrayList<String>();
    	
    	list.add("Bruno");
    	list.add("Victor");
    	list.add("Tchago");
    	list.add("Alezinho");
    	list.add("Mario");
    	
    	return list;
	}
	
	
    public static void main( String[] args ) {
    	
     	// Instânciando e chamando métodos de uma classe que implementa uma inferface
    	Calculator calculate = new Calculator();

    	int soma = calculate.add(2, 3);
    	System.out.println( "Valor da soma: " + soma );
    	
    	int subtracao = calculate.substract(2, 3);
    	System.out.println( "Valor da subtração: " + subtracao );
    	
    	int divisao = calculate.divide(10, 2);
    	System.out.println( "Valor da divisão: " + divisao );
    	
    	int muliplicacao = calculate.multiply(2, 5);
    	System.out.println( "Valor da multiplicação: " + muliplicacao );
    	
    	/*
    	 * Chamando um método Herdado de outra classe
    	 */
    	System.out.println(callExtended());
    	 
    	ArrayList<String> listNames = returnRockinstonesListnames();
    	
    	/*
    	 * Listas em Java 
    	 */

    	// Forma antiga de fazer iteração em lista
    	for(int i = 0; i <= listNames.size()-1; i++) {
    		System.out.println("Nome: " + listNames.get(i));
    	}
    	
    	
    	listNames.forEach(name -> {
    	 	System.out.println("Nome: " + name);
    	});
    	
    	
    	// Criando um objeto do tipo Music Members
    	MusicMembers member = new MusicMembers(); 
    	
    	member.setId(1);
    	member.setNome("Bruno");
    	member.setDescricao("Guitarrista que interpreta o Ronn Wood na Rockinstones");
    	member.setInstrumento("guitarra Solo");
    	
    	
    	
    	ArrayList<MusicMembers> musicians = new ArrayList<MusicMembers>();
    	
    	// Criando um objeto do tipo Music Members [BRUNO]
    	MusicMembers bruno = new MusicMembers(); 
    	
    	bruno.setId(1);
    	bruno.setNome("Bruno");
    	bruno.setDescricao("Guitarrista que interpreta o Ronn Wood na Rockinstones");
    	bruno.setInstrumento("guitarra Solo");
    	
    	musicians.add(bruno);
    	
    	
       	// Criando um objeto do tipo Music Members [BRUNO]
    	MusicMembers victor = new MusicMembers(); 
    	
    	victor.setId(2);
    	victor.setNome("Victor");
    	victor.setDescricao("Guitarrista interpreta o Daryl Johnes na Rockinstones");
    	victor.setInstrumento("Bass Man");
    	
    	musicians.add(victor);
    	
    	musicians.forEach(musician -> {
    		System.out.println(musician.getId());
    		System.out.println(musician.getNome());
    		System.out.println(musician.getDescricao());
    		System.out.println(musician.getInstrumento());
    	});
    }
}
