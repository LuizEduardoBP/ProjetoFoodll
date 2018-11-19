package Projetoll;


import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Cliente {
	private String nome;
	private int id;
	private Integer endereco;
	@ManyToMany
	@JoinTable(
			name = "cliente_restricoes",
			joinColumns = @JoinColumn(name = "cliente_id"),
			inverseJoinColumns = @JoinColumn(name = "restricoes_id"))
	private Set<Restricoes>tem;
	private Set<Comida>Pedir;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getEndereco() {
		return endereco;
	}
	public void setEndereco(Integer endereco) {
		this.endereco = endereco;
	}
	public Set<Restricoes> getTem() {
		return tem;
	}
	public void setTem(Set<Restricoes> tem) {
		this.tem = tem;
	}
	public Set<Comida> getPedir() {
		return Pedir;
	}
	public void setPedir(Set<Comida> pedir) {
		Pedir = pedir;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", id=" + id + ", endereco=" + endereco + ", tem=" + tem + ", Pedir=" + Pedir
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pedir == null) ? 0 : Pedir.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tem == null) ? 0 : tem.hashCode());
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
		Cliente other = (Cliente) obj;
		if (Pedir == null) {
			if (other.Pedir != null)
				return false;
		} else if (!Pedir.equals(other.Pedir))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tem == null) {
			if (other.tem != null)
				return false;
		} else if (!tem.equals(other.tem))
			return false;
		return true;
	}
	public Cliente(String nome, int id, Integer endereco, Set<Restricoes> tem, Set<Comida> pedir) {
		super();
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.tem = tem;
		Pedir = pedir;
	}
	
}
