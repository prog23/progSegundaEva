package Biblioteca;

public class prueba {

	public static void main(String[] args) {
		
		Libro libro= new Libro("123","El Quijote", 1605);
		
		Revista revista= new Revista("133","Fotogramas", 2019, 2011 );
		
		System.out.println(libro);
		Ejemplar e = libro;		
		Prestable p = libro;
		
		
		System.out.println(revista);
		Ejemplar r = revista;
	}

}
