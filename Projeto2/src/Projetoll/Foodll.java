package Projetoll;

import java.util.ArrayList;

public class Foodll implements Food {
	
	private ArrayList<Restaurante>Restaurantes = new ArrayList<>();
	private ArrayList<Restricoes>restricoes = new ArrayList<>();
	private ArrayList<Cliente>Clientes = new ArrayList<>();
	private ArrayList<Comida>Comidas = new ArrayList<>();
	private ArrayList<Cardapio>Cardapios = new ArrayList<>();


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
	public void removRestaurante(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restricoes addrestricoes(int id, String tipo) {
		Restricoes n = new Restricoes(id, tipo, null);
		n.setId(id);
		n.setTipo(tipo);
		restricoes.add(n);
		return n;
	}

	@Override
	public void removRestricoes(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente addCliente(int id, String nome) {
		Cliente c = new Cliente(nome, id, id, restricoes, null);
		c.setNome(nome);
		c.setId(id);
		Clientes.add(c);
		return c;
	}

	@Override
	public void removeCliente(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comida addComida(int id, String nome, String ingredientes) {
		Comida b = new Comida(id, ingredientes, ingredientes, id, ingredientes);
		b.setId(id);
		b.setNome(nome);
		b.setIngredientes(ingredientes);
		Comidas.add(b);
		return b;
	}

	@Override
	public void removComida(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cardapio addCardapio(int id) {
		Cardapio l = new Cardapio(id, Comidas, restricoes);
		l.setId(id);
		Cardapios.add(l);
		return l;
	}

	@Override
	public void removcardapio(int id) {
		// TODO Auto-generated method stub
		
	}

}
