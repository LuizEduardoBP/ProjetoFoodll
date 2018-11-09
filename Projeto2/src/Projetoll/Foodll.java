package Projetoll;

import java.util.ArrayList;

public class Foodll implements Food {
	
	private ArrayList<Restaurante>Restaurantes = new ArrayList<>();
	private ArrayList<Restricoes>restricoes = new ArrayList<>();

	@Override
	public Restaurante addRestaurante(int id, String nome, int telefone) {
		Restaurante r = new Restaurante(telefone, nome, telefone, null, null);
		r.setId(id);
		r.setNome(nome);
		r.setTelefone(telefone);
		Restaurantes.add(r);
		return r;
	}

	@Override
	public void removRestaurante(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restricoes addrestricoes(int id, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removRestricoes(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente addCliente(int id, String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCliente(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comida addComida(int id, String nome, String ingredientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removComida(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cardapio addCardapio(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removcardapio(int id) {
		// TODO Auto-generated method stub
		
	}

}
