package lab10;

public interface MarioState {

	public void pegarCogumelo(Mario mario);

	public void levarDano(Mario mario) throws Exception;

	public void pegarFlor(Mario mario);

}