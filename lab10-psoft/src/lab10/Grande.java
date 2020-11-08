package lab10;

public class Grande implements MarioState {

	@Override
	public void pegarCogumelo(Mario mario) {
		mario.adicionarPontos(1000);

	}

	@Override
	public void levarDano(Mario mario) {
		mario.mudarSituacao(new Pequeno());

	}

	@Override
	public void pegarFlor(Mario mario) {
		mario.mudarSituacao(new Fogo());

	}

}
