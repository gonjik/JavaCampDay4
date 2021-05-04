
public interface CampaignService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void remove(Campaign campaign);
	void applyCampaign(Campaign campaign, Player player, Game game);

}
