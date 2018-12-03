package Projetoll;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Restricoes implements Identificavel{
	@GeneratedValue
	@Id
	private Long id;
	private String tipo;
	@ManyToMany
	@JoinTable(
			name = "restricoes_comida",
			joinColumns = @JoinColumn(name = "restricoes_id"),
			inverseJoinColumns = @JoinColumn(name = "comida_id"))	
	private Set<Comida>Ter;

	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Set<Comida> getTer() {
		return Ter;
	}
	public void setTer(Set<Comida> ter) {
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	public Restricoes(Long id, String tipo, Set<Comida> ter) {
		super();
		this.id = id;
		this.tipo = tipo;
		Ter = ter;
	}
	public Restricoes() {
		// TODO Auto-generated constructor stub
	}


	

}
