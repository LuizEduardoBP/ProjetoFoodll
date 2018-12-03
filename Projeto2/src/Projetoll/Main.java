package Projetoll;

public class Main {

	public static void main(String[] args) {
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Michael jackson");
		dao.save(c);
		
		Cliente c2 = new Cliente();
		c2.setNome("Xande de Pilares");
		dao.save(c2);
		
		Cliente find = dao.find(Cliente.class, c2.getId());
		System.out.println(find.getNome());
	}
	
}