
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contadopaulo = new Conta();
		contadopaulo.deposita(100);
		
		
		contadopaulo.titular = paulo;
		System.out.println(contadopaulo.titular.nome);
	}
}
