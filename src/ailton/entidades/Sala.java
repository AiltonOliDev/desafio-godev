package ailton.entidades;

public class Sala {
	public String nome;
	public int lotacao;

	public Sala(String nome, int lotacao) {
		this.nome = nome;
		this.lotacao = lotacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
}
