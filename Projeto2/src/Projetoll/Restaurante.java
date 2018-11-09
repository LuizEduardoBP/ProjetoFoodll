package Projetoll;

import java.util.ArrayList;

public class Restaurante {
	private int id;
	private String nome;
	private int telefone;
	private ArrayList<Comida>Tem;
	private ArrayList<Cliente>Possui;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public ArrayList<Comida> getTem() {
		return Tem;
	}
	public void setTem(ArrayList<Comida> tem) {
		Tem = tem;
	}
	public ArrayList<Cliente> getPossui() {
		return Possui;
	}
	public void setPossui(ArrayList<Cliente> possui) {
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
	public Restaurante(int id, String nome, int telefone, ArrayList<Comida> tem, ArrayList<Cliente> possui) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		Tem = tem;
		Possui = possui;
	}
	
}
