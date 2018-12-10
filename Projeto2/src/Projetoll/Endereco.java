package Projetoll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco implements Identificavel{
	@GeneratedValue
	@Id
	private Long id;
	private String rua;
	private Integer numero;

	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Endereco other = (Endereco) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	public Endereco(String rua, Integer numero) {
		super();
		this.rua = rua;
		this.numero = numero;
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
