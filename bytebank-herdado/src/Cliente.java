
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticado;
	
	public Cliente() {
		this.autenticado = new AutenticacaoUtil();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticado.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticado.autentica(senha);
	}
}
