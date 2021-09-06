package modelo.enumerados;

public enum PessoaEstado {
	RF("Pessoa de Refer�ncia"), P ("Pessoa da Composi��o Familiar"), F("Falecida");
	
	private String descricao;
	
	PessoaEstado(String descricao){
		this.descricao = descricao;
	}
	
	public String toString() {
		return descricao;
	}
}