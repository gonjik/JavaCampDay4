
public class GameManager implements GameService{
	
	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi");
		
	}

	@Override
	public void list(Game game) {
		System.out.println("Oyunlar listelendi");
		
	}

}
