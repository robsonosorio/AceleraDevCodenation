package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);
        int cont = 1;
        while (lista.get(cont) < 350){
            lista.add(lista.get(cont) + lista.get(cont -1));
            cont++;
        }
        return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		if (fibonacci().contains(a)) {
            return true;
        } else{
            return false;
        }
	}

}