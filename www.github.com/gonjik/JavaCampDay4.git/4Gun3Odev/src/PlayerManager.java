
public class PlayerManager implements PlayerService {

	
	private Validator validator;
	
	
	public PlayerManager(Validator validator) {
		this.validator = validator;
	}
	
	@Override
	public void add(Player player) {
		
		Utils.runValidator(validator, player, player.getFirstName() + " : Kullan�c� adl� oyuncu eklendi" );

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " : Kullan�c� adl� oyuncu eklendi");
		Utils.runValidator(validator, player, null);
	}

	@Override
	public void remove(Player player) {
		System.out.println(player.getFirstName() + " : Kullan�c� adl� oyuncu eklendi");
		Utils.runValidator(validator, player, null);
	}



}
