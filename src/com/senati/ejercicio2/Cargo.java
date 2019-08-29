package com.senati.ejercicio2;

public class Cargo {
	int id;
	String nombre1;
	float sueldo;
	public Cargo() {
		super();
	}
	public Cargo(int id, String nombre1, float sueldo) {
		super();
		this.id = id;
		this.nombre1 = nombre1;
		this.sueldo = sueldo;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre1
	 */
	public String getNombre1() {
		return nombre1;
	}
	/**
	 * @param nombre1 the nombre1 to set
	 */
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nombre1=" + nombre1 + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre1 == null) ? 0 : nombre1.hashCode());
		result = prime * result + Float.floatToIntBits(sueldo);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		if (id != other.id)
			return false;
		if (nombre1 == null) {
			if (other.nombre1 != null)
				return false;
		} else if (!nombre1.equals(other.nombre1))
			return false;
		if (Float.floatToIntBits(sueldo) != Float.floatToIntBits(other.sueldo))
			return false;
		return true;
	}
	
}
