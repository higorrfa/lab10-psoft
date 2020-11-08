package lab10;

public class Mario {

	public MarioState situacao;
	public long pontuacao;

	public Mario() {
		this.situacao = new Pequeno();
		this.pontuacao = 0;
	}

	public void pegarCogumelo() {

		situacao.pegarCogumelo(this);

	}

	public void levarDano() throws Exception {

		situacao.levarDano(this);

	}

	public void pegarFlor() {

		situacao.pegarFlor(this);

	}

	public void adicionarPontos(int pontos) {
		this.pontuacao += pontos;
	}

	public void mudarSituacao(MarioState situacao) {
		this.situacao = situacao;
	}

}
