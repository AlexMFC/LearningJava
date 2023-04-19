package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //nao aceita tipos primitivos, tem que ser usada a Wrapper class
		
		list.add("Maria");
		list.add("Alex");
		list.add(1, "Adicionado"); //adiciona na posicao 2
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println(list.size());
		
		list.remove("Alex"); //consegue comparar parametros
		System.out.println(list); //retorna Maria,Adicionado
		
		list.removeIf(x -> x.charAt(0) == 'A'); //recebe uma lambda -> todo x que na posicao 0 tiver o char A
		System.out.println(list); //retorna Maria
		
		System.out.println(list.indexOf("Maria"));

		//filtrar com todo mundo que comeca com A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//Declara uma list String -> converte a lista para Stream(aceita operacoes com lambda) 
		//->filtra a stream conforme predicado (nao eh compativel com list) 
		//-> converte novamente pra lista usando a funcao collect(Collectors.toList())
		
		System.out.println(result);
		
		
		//Como encontrar um elemento que atenda um predicado
		//Encontrar o primeiro elemento com a letra A
		String name = list.stream().filter(x->x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
