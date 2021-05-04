

public class ValidatorManager implements Validator{

	public ValidatorManager(Player player) {
	}
	
	
	@Override
	public boolean validate(Player player) {
		return player.getNationalityId().length()==11;
	}

}
