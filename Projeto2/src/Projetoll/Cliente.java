package Projetoll;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private int id;
	private Integer endereco;
	private ArrayList<Restricoes>tem;
	private ArrayList<Comida>Pedir;
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
	public ArrayList<Restricoes> getTem() {
		return tem;
	}
	public void setTem(ArrayList<Restricoes> tem) {
		this.tem = tem;
	}
	public ArrayList<Comida> getPedir() {
		return Pedir;
	}
	public void setPedir(ArrayList<Comida> pedir) {
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
	public Cliente(String nome, int id, Integer endereco, ArrayList<Restricoes> tem, ArrayList<Comida> pedir) {
		super();
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.tem = tem;
		Pedir = pedir;
	}
	
}
