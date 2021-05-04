
public class SalesManager implements SalesService {

	@Override
	public void buy(Player player, Game game) {
		System.out.println(player.getFirstName() + " : " + game.name + " " + "satýn aldýnýz..");
		
	}
	
	

}
