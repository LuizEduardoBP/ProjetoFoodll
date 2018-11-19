package Projetoll;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restricoes {
	private int id;
	private String tipo;
	private ArrayList<Comida>Ter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<Comida> getTer() {
		return Ter;
	}
	public void setTer(ArrayList<Comida> ter) {
		Ter = ter;
	}
	@Override
	public String toString() {
		return "Restricoes [id=" + id + ", tipo=" + tipo + ", Ter=" + Ter + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Ter == null) ? 0 : Ter.hashCode());
		result = prime * result + id;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Restricoes other = (Restricoes) obj;
		if (Ter == null) {
			if (other.Ter != null)
				return false;
		} else if (!Ter.equals(other.Ter))
			return false;
		if (id != other.id)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	public Restricoes(int id, String tipo, ArrayList<Comida> ter) {
		super();
		this.id = id;
		this.tipo = tipo;
		Ter = ter;
	}
	

}
