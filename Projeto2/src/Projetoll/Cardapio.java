package Projetoll;

import java.util.ArrayList;

public class Cardapio {
	private Integer id;
	private ArrayList<Comida>Tem;
	private ArrayList<Restricoes>filtrar;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ArrayList<Comida> getTem() {
		return Tem;
	}
	public void setTem(ArrayList<Comida> tem) {
		Tem = tem;
	}
	public ArrayList<Restricoes> getFiltrar() {
		return filtrar;
	}
	public void setFiltrar(ArrayList<Restricoes> filtrar) {
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
	public Cardapio(Integer id, ArrayList<Comida> tem, ArrayList<Restricoes> filtrar) {
		super();
		this.id = id;
		Tem = tem;
		this.filtrar = filtrar;
	}
	
	

}
