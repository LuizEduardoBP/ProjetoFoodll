package Projetoll;

public class Projeto implements Identificavel {

	@Override
	public long getId() {
		return 0;
	}

	@Override
	public void setId(Long id) {

	}

	@Override
	public Restaurante addRestaurante(Long id, String nome, int telefone) throws IdInvalidoException {
		Restaurante restaurante = new Restaurante(id, nome, telefone, null, null);
		if(id == null || id.isEmpty()) {
			throw new IdInvalidoException();
		return null;
	}

	@Override
	public void removRestaurante(Long id) {
	}

	@Override
	public Restricoes addrestricoes(long id, String tipo) {
		return null;
	}

	@Override
	public void removRestricoes(Long id) {
	}

	@Override
	public Comida addComida(Long id, String nome, String ingredientes) {
		return null;
	}

	@Override
	public void removComida(Long id) {
	}

	@Override
	public Cliente addCliente(Long id, String nome) {
		return null;
	}

	@Override
	public void removeCliente(Long id) {
	}

	@Override
	public Cardapio addCardapio(Long id) {
		return null;
	}

	@Override
	public void removcardapio(long id) {

	}

}
