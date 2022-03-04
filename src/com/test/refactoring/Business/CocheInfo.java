package com.test.refactoring.Business;
/**
 * EStudiante
 * @author estudiante
 * @version 1.0
 */
public class CocheInfo {
	/**
	 * ma
	 */
	public String matricula;
	/**
	 * color
	 */
	public String color;
	/**
	 * com
	 */
	public String combustible;
	/**
	 * num
	 */
	public Integer numPlazas;
	/**
	 * condutcor
	 */
	public ConductorInfoCoche conductorDatos;
	/**
	 * info
	 * @param conductorDatos info
	 */
	public CocheInfo(ConductorInfoCoche conductorDatos) {
		this.conductorDatos = conductorDatos;
	}
}