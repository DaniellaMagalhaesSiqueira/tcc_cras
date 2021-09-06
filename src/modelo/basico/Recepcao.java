package modelo.basico;

import java.time.LocalDate;

public class Recepcao {

	private Long id;
	
	private LocalDate data;
	
	private int qtd;

	public Recepcao() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
