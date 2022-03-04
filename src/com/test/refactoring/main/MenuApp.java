package com.test.refactoring.main;

import java.util.Scanner;

import com.test.refactoring.Business.Camion;
import com.test.refactoring.Business.Coche;
import com.test.refactoring.utils.Utils;
/**
 * Clase main
 * @author estudiante
 * @version 1.0
 */
public class MenuApp {
	/**
	 * main
	 * @param args arg
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mostrarPresentacion();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = leerString(sc);
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = leerString(sc);
		
		bienvenida(nombre, primerApellido);
		
		System.out.println("Introduce el n�mero de coches : ");
		int numCoches = leerInt(sc);
		Coche[] listaCoches = metodoCoche(numCoches);
		
		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones= leerInt(sc);
		Camion[] listaCamiones = metodoCamion(numCamiones);
		
		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);
		
		sc.close();
		
	}
	/**
	 * @param numCamiones camiones
	 * @return lista
	 */
	public static Camion[] metodoCamion(int numCamiones) {
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].Acelerar(25);
		}
		return listaCamiones;
	}
	/**
	 * @param numCoches numCoches
	 * @return lista coches
	 */
	public static Coche[] metodoCoche(int numCoches) {
		Coche[] listaCoches = new Coche[numCoches];
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerar(20);
		}
		return listaCoches;
	}
	/**
	 * leer Int
	 * @param sc scanner
	 * @return leido
	 */
	private static int leerInt(Scanner sc) {
		int numCoches= sc.nextInt();
		return numCoches;
	}

	/**
	 * @param nombre nombre 
	 * @param primerApellido primerApellido
	 */
	private static void bienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * leer Stirng
	 * @param sc scanner
	 * @return texto
	 */
	private static String leerString(Scanner sc) {
		String nombre = sc.nextLine();
		return nombre;
	}
	/**
	 * Muestra
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * Lista
	 * @param listaCoches listaCoches
	 */
	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].detener();
		}
	}
	/**
	 * Detener
	 * @param listaCamiones listaCamiones
	 */
	private static void detenerVehiculos(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].Detener();
		}
	}

}
