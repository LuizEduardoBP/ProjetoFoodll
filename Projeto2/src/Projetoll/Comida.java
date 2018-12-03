package Projetoll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comida implements Identificavel {
	@GeneratedValue
	@Id
	private Long id;
	private String nome;
	private String restricoes;
	private Integer preco;
	private String ingredientes;
	
	public String getNome() {
		return nome;
	}
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRestricoes() {
		return restricoes;
	}
	public void setRestricoes(String restricoes) {
		this.restricoes = restricoes;
	}
	public Integer getPreco() {
		return preco;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public String toString() {
		return "Comida [id=" + id + ", nome=" + nome + ", restricoes=" + restricoes + ", preco=" + preco
				+ ", ingredientes=" + ingredientes + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((restricoes == null) ? 0 : restricoes.hashCode());
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
		Comida other = (Comida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (restricoes == null) {
			if (other.restricoes != null)
				return false;
		} else if (!restricoes.equals(other.restricoes))
			return false;
		return true;
	}

	public Comida(Long id, String nome, String restricoes, Integer preco, String ingredientes) {
		super();
		this.id = id;
		this.nome = nome;
		this.restricoes = restricoes;
		this.preco = preco;
		this.ingredientes = ingredientes;
	}

	public Comida() {
		// TODO Auto-generated constructor stub
	}
}


