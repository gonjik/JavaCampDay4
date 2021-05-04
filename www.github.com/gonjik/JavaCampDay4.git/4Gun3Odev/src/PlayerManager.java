
public class PlayerManager implements PlayerService {

	
	private Validator validator;
	
	
	public PlayerManager(Validator validator) {
		this.validator = validator;
	}
	
	@Override
	public void add(Player player) {
		
		Utils.runValidator(validator, player, player.getFirstName() + " : Kullanýcý adlý oyuncu eklendi" );

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " : Kullanýcý adlý oyuncu eklendi");
		Utils.runValidator(validator, player, null);
	}

	@Override
	public void remove(Player player) {
		System.out.println(player.getFirstName() + " : Kullanýcý adlý oyuncu eklendi");
		Utils.runValidator(validator, player, null);
	}



}
