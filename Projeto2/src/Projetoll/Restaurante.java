	package Projetoll;

import java.util.Set;

public class Restaurante {
	private Integer id;
	private String nome;
	private int telefone;
	private Set<Comida>Tem;
	private Set<Cliente>Possui;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Set<Comida> getTem() {
		return Tem;
	}
	public void setTem(Set<Comida> tem) {
		Tem = tem;
	}
	public Set<Cliente> getPossui() {
		return Possui;
	}
	public void setPossui(Set<Cliente> possui) {
		Possui = possui;
	}
	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", Tem=" + Tem + ", Possui="
				+ Possui + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Possui == null) ? 0 : Possui.hashCode());
		result = prime * result + ((Tem == null) ? 0 : Tem.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + telefone;
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
		Restaurante other = (Restaurante) obj;
		if (Possui == null) {
			if (other.Possui != null)
				return false;
		} else if (!Possui.equals(other.Possui))
			return false;
		if (Tem == null) {
			if (other.Tem != null)
				return false;
		} else if (!Tem.equals(other.Tem))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}
	public Restaurante(int id, String nome, int telefone, Set<Comida> tem, Set<Cliente> possui) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		Tem = tem;
		Possui = possui;
	}
	
}
