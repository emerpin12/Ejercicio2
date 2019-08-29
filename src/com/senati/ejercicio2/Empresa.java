package com.senati.ejercicio2;

public class Empresa extends Pais{
	
		int codigo;
		String nombre;
		String rsocial;
		String telefono;
		String ruc;
		String direccion;
		String toperacion;
		public Empresa() {
			super();
		}
		public Empresa(int id, String nombre2, String descripcion, int codigo, String nombre, String rsocial, String telefono, String ruc, String direccion,
				String toperacion) {
			super(id, nombre2, descripcion);
			this.codigo = codigo;
			this.nombre = nombre;
			this.rsocial = rsocial;
			this.telefono = telefono;
			this.ruc = ruc;
			this.direccion = direccion;
			this.toperacion = toperacion;
		}
		/**
		 * @return the codigo
		 */
		public int getCodigo() {
			return codigo;
		}
		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the rsocial
		 */
		public String getRsocial() {
			return rsocial;
		}
		/**
		 * @param rsocial the rsocial to set
		 */
		public void setRsocial(String rsocial) {
			this.rsocial = rsocial;
		}
		/**
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}
		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		/**
		 * @return the ruc
		 */
		public String getRuc() {
			return ruc;
		}
		/**
		 * @param ruc the ruc to set
		 */
		public void setRuc(String ruc) {
			this.ruc = ruc;
		}
		/**
		 * @return the direccion
		 */
		public String getDireccion() {
			return direccion;
		}
		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		/**
		 * @return the toperacion
		 */
		public String getToperacion() {
			return toperacion;
		}
		/**
		 * @param toperacion the toperacion to set
		 */
		public void setToperacion(String toperacion) {
			this.toperacion = toperacion;
		}
		@Override
		public String toString() {
			return "Empresa [codigo=" + codigo + ", nombre=" + nombre + ", rsocial=" + rsocial + ", telefono="
					+ telefono + ", ruc=" + ruc + ", direccion=" + direccion + ", toperacion=" + toperacion + ", id="
					+ id + ", descripcion=" + descripcion + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + codigo;
			result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			result = prime * result + ((rsocial == null) ? 0 : rsocial.hashCode());
			result = prime * result + ((ruc == null) ? 0 : ruc.hashCode());
			result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
			result = prime * result + ((toperacion == null) ? 0 : toperacion.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empresa other = (Empresa) obj;
			if (codigo != other.codigo)
				return false;
			if (direccion == null) {
				if (other.direccion != null)
					return false;
			} else if (!direccion.equals(other.direccion))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (rsocial == null) {
				if (other.rsocial != null)
					return false;
			} else if (!rsocial.equals(other.rsocial))
				return false;
			if (ruc == null) {
				if (other.ruc != null)
					return false;
			} else if (!ruc.equals(other.ruc))
				return false;
			if (telefono == null) {
				if (other.telefono != null)
					return false;
			} else if (!telefono.equals(other.telefono))
				return false;
			if (toperacion == null) {
				if (other.toperacion != null)
					return false;
			} else if (!toperacion.equals(other.toperacion))
				return false;
			return true;
		}
		
		
}



