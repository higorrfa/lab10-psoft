package lab10;

public class Pequeno implements MarioState {

	@Override
	public void pegarCogumelo(Mario mario) {
		mario.mudarSituacao(new Grande());

	}

	@Override
	public void levarDano(Mario mario) throws Exception {

		throw new Exception("Mario morreu.");

	}

	@Override
	public void pegarFlor(Mario mario) {
		mario.mudarSituacao(new Fogo());

	}

}
