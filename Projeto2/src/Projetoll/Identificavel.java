package Projetoll;

public interface Identificavel {
	
	public Restaurante addRestaurante(Long id, String nome, int telefone) throws IdInvalidoException; 

	public void removRestaurante(Long id);

	
	public Restricoes addrestricoes(long id, String tipo);

	public void removRestricoes(Long id);

	
	public Comida addComida(Long id, String nome, String ingredientes);

	public void removComida(Long id);

	
	public Cliente addCliente(Long id, String nome);

	public void removeCliente(Long id);

	
	public Cardapio addCardapio(Long id);

	public void removcardapio(long id);

	
	public long getId();
	
	public void setId(Long id);
	
	
}
