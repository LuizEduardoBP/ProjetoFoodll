package Projetoll;

public class Main {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente c = new Cliente();
		c.setNome("David Bowie");
		c.setEndereco(10);
		dao.save(c);
		
		Cliente c2 = new Cliente();
		c2.setNome("Pericles");
		c2.setEndereco(5);
		dao.save(c2);
		
		Cliente find = dao.find(Cliente.class, c2.getId());
		System.out.println(find.getNome());
		
		
		DAO<Comida> dao1 = new DAO<Comida>();
		Comida a = new Comida();
		a.setNome("Hamburguer");
		a.setIngredientes("Pao, Tomate, Queijo, Carne, Alface");
		a.setPreco(30);
		a.setRestricoes("intolerancia a lactose, alergia a tomate, Alergia a fermento");
		dao1.save(a);
		
		Comida a2 = new Comida();
		a2.setNome("Pizza");
		a2.setIngredientes("Tomate, Queijo, frango, Alface");
		a2.setPreco(30);
		a2.setRestricoes("Alergia a tomate, Alergia a fermento, Alergia a temperos");
		dao1.save(a2);
		
		Comida find1 = dao1.find(Comida.class, c2.getId());
		System.out.println(find1.getNome());
		
		
		DAO<Restricoes> dao3 = new DAO<Restricoes>();
		Restricoes r = new Restricoes();
		r.setTipo("Intolerancia a lactose");
		dao3.save(r); 
		
		Restricoes r2 = new Restricoes();
		r2.setTipo("Alergia a tomate");
		dao3.save(r2); 
		
		Restricoes r3 = new Restricoes();
		r3.setTipo("Alergia a temperos");
		dao3.save(r3);
		
		Restricoes r4 = new Restricoes();
		r4.setTipo("Alergia a fermento");
		dao3.save(r4); 

		Restricoes find2 = dao3.find(Restricoes.class, r.getId());
	}

}