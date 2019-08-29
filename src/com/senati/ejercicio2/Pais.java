package com.senati.ejercicio2;

public class Pais {
		int id;
		String nombre2;
		String descripcion;
		public Pais() {
			super();
		}
		public Pais(int id, String nombre2, String descripcion) {
			super();
			this.id = id;
			this.nombre2 = nombre2;
			this.descripcion = descripcion;
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
		 * @return the nombre2
		 */
		public String getNombre2() {
			return nombre2;
		}
		/**
		 * @param nombre2 the nombre2 to set
		 */
		public void setNombre2(String nombre2) {
			this.nombre2 = nombre2;
		}
		/**
		 * @return the descripcion
		 */
		public String getDescripcion() {
			return descripcion;
		}
		/**
		 * @param descripcion the descripcion to set
		 */
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		@Override
		public String toString() {
			return "Pais [id=" + id + ", nombre2=" + nombre2 + ", descripcion=" + descripcion + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
			result = prime * result + id;
			result = prime * result + ((nombre2 == null) ? 0 : nombre2.hashCode());
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
			Pais other = (Pais) obj;
			if (descripcion == null) {
				if (other.descripcion != null)
					return false;
			} else if (!descripcion.equals(other.descripcion))
				return false;
			if (id != other.id)
				return false;
			if (nombre2 == null) {
				if (other.nombre2 != null)
					return false;
			} else if (!nombre2.equals(other.nombre2))
				return false;
			return true;
		}
		
}
