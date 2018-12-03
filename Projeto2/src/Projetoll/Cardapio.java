package Projetoll;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cardapio implements Identificavel {
	@GeneratedValue
	@Id
	private Long id;
	@ManyToMany
	@JoinTable(name = "cardapio_comida", joinColumns = @JoinColumn(name = "cardapio_id"), inverseJoinColumns = @JoinColumn(name = "comida_id"))
	private Set<Comida> Tem;
	@ManyToMany
	@JoinTable(name = "cardapio_restricoes", joinColumns = @JoinColumn(name = "cardapio_id"), inverseJoinColumns = @JoinColumn(name = "restricoes_id"))
	private Set<Restricoes> filtrar;

	public long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Set<Comida> getTem() {
		return Tem;
	}

	public void setTem(Set<Comida> tem) {
		Tem = tem;
	}

	public Set<Restricoes> getFiltrar() {
		return filtrar;
	}

	public void setFiltrar(Set<Restricoes> filtrar) {
		this.filtrar = filtrar;
	}

	@Override
	public String toString() {
		return "Cardapio [id=" + id + ", Tem=" + Tem + ", filtrar=" + filtrar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tem == null) ? 0 : Tem.hashCode());
		result = prime * result + ((filtrar == null) ? 0 : filtrar.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cardapio other = (Cardapio) obj;
		if (Tem == null) {
			if (other.Tem != null)
				return false;
		} else if (!Tem.equals(other.Tem))
			return false;
		if (filtrar == null) {
			if (other.filtrar != null)
				return false;
		} else if (!filtrar.equals(other.filtrar))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Cardapio(Long id, Set<Comida> tem, Set<Restricoes> filtrar) {
		super();
		this.id = id;
		Tem = tem;
		this.filtrar = filtrar;
	}

	

}
