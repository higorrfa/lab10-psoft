package lab10;

public class Fogo implements MarioState {

	@Override
	public void pegarCogumelo(Mario mario) {

		mario.adicionarPontos(1000);

	}

	@Override
	public void levarDano(Mario mario) {

		mario.mudarSituacao(new Grande());

	}

	@Override
	public void pegarFlor(Mario mario) {

		mario.adicionarPontos(1000);

	}

}
