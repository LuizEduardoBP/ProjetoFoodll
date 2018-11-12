package Projetoll;

public interface Food {
	public Restaurante addRestaurante(int id, String nome, int telefone);
	public void removRestaurante(Integer id);
	
	
	public Restricoes addrestricoes(int id, String tipo);
	public void removRestricoes(int id);
	
	
	public Cliente addCliente(int id, String nome);
	public void removeCliente(int id);
	
	
	public Comida addComida(int id, String nome, String ingredientes);
	public void removComida(int id);
	
	
	public Cardapio addCardapio(int id);
	public void removcardapio(int id);
	

}
