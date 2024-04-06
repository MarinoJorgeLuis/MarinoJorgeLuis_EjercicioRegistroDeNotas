package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// Para el alumno Marino Jorge Luis registrar las notas finales de 4 materias
		
		Alumno alumno=new Alumno();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese legajo:");
		Integer legajo=sc.nextInt();
		System.out.println("Ingrese apellido:");
		String apellido=sc.next();
		System.out.println("Ingrese nombre:");
		String nombre=sc.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		
		int numMateria=1;
		int cantMateria=4;
		while(numMateria<=cantMateria){
			System.out.println("Ingrese codigo de la materia:");
			String codigoMateria=sc.next();
			System.out.println("Ingrese nombre de la materia:");
			String nombreMateria=sc.next();
			
			Materia materia=new Materia(codigoMateria,nombreMateria);
			
			
			System.out.println("Ingrese el codigo del registro de nota:");
			String codigoNota=sc.next();
			System.out.println("Ingrese la nota final:");
			Float nota=sc.nextFloat();
			
			RegistroNota registroNota=new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMateria++;
		}
		
		sc.close();

	}

}
