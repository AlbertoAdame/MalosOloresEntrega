package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Utiles
 * @author estudiante
 *@version 1.0
 */
public class Utils {
	/**
	 * precio
	 */
	private static final int PRECIOMES = 750;
	/**
	 * iva
	 */
	private static final float IVA = 1.21f;
	/**
	 * preicodia
	 */
	private static final int PRECIODIA = 50;
	/**
	 * Hora
	 * @return hora
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Fecha
	 * @return fecha
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Calcular
	 * @param dias dias
	 * @return precio
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * PRECIODIA * IVA;
		return result;
	}
	/**
	 * CAlcular renting
	 * @param meses mes
	 * @return precio
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * PRECIOMES * IVA;
	}

}
