package Projetoll;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente implements Identificavel {
	@GeneratedValue(generator="seqCliente")
	@SequenceGenerator(name="seqCliente", sequenceName="seq_cliente")
	@Id
	private Long id;
	private String nome;
	private Integer endereco;
	@ManyToMany
	@JoinTable(name = "cliente_restricoes", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "restricoes_id"))
	private Set<Restricoes> tem;
	@ManyToMany
	@JoinTable(name = "cliente_comida", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "comida_id"))
	private Set<Comida> pedir;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(Long l) {
		this.id = l;
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
	
	public Cliente(Long id, String nome, Integer endereco, Set<Restricoes> tem, Set<Comida> pedir) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.tem = tem;
		this.pedir = pedir;
	}

	public Cliente() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pedir == null) ? 0 : pedir.hashCode());
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
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
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
		if (pedir == null) {
			if (other.pedir != null)
				return false;
		} else if (!pedir.equals(other.pedir))
			return false;
		if (tem == null) {
			if (other.tem != null)
				return false;
		} else if (!tem.equals(other.tem))
			return false;
		return true;
	}

	public Set<Comida> getPedir() {
		return pedir;
	}

	public void setPedir(Set<Comida> pedir) {
		this.pedir = pedir;
	}


	

	

}
