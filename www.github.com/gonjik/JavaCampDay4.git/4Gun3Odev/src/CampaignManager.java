
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " g�ncellendi.");
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName() + " silindi.");
		
	}

	@Override
	public void applyCampaign(Campaign campaign, Player player, Game game) {
		System.out.println(player.getFirstName() + " : " + campaign.getName() + 
				" ile " + game.getName() + " oyununu sat�n ald�n.");
		
	}

}
