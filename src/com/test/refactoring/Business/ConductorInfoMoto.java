package com.test.refactoring.Business;
/**
 *  Clase info
 * @author estudiante
 * @version 1.0
 */
public class ConductorInfoMoto {
	/**
	 * moto
	 */
	public MotocicletaInfo motoDatos;
	/**
	 * nomnbre
	 */
	public String nombreConductor;
	/**
	 * dni
	 */
	public String dniConductor;
	/**
	 * info
	 * @param motoDatos datos
	 */
	public ConductorInfoMoto(MotocicletaInfo motoDatos) {
		this.motoDatos = motoDatos;
	}
}