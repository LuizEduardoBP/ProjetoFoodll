	package Projetoll;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Restaurante implements Identificavel{
	@GeneratedValue
	@Id
	private Long id;
	private String nome;
	private int telefone;
	@ManyToMany
	@JoinTable(
			name = "restaurante_comida",
			joinColumns = @JoinColumn(name = "restaurante_id"),
			inverseJoinColumns = @JoinColumn(name = "comida_id"))
	private Set<Comida>Tem;
	@ManyToOne
	private Set<Cliente>Possui;

	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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

	public Restaurante(Long id, String nome, int telefone, Set<Comida> tem, Set<Cliente> possui) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		Tem = tem;
		Possui = possui;
	}
	@Override
	public Restaurante addRestaurante(Long id, String nome, int telefone) throws IdInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removRestaurante(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Restricoes addrestricoes(long id, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removRestricoes(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Comida addComida(Long id, String nome, String ingredientes) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removComida(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cliente addCliente(Long id, String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removeCliente(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cardapio addCardapio(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removcardapio(long id) {
		// TODO Auto-generated method stub
		
	}

}
