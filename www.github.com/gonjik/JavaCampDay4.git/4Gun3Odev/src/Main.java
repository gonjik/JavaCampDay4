import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		ValidatorManager validator = new ValidatorManager(null);
		PlayerManager playerManager = new PlayerManager(validator);
		Player gonca = new Player(1, "Gonca", "Derman", "12345678901", LocalDate.of(1982,12,28));
		Player caner = new Player(2, "Caner", "Bilmiyorum", "23456718901" ,LocalDate.of(1986,2,8));
		Player agit = new Player(3, "Agit", "Doðan", "23455178901" ,LocalDate.of(1988,2,9));
		Player ali = new Player(4, "Ali", "Bug", "23451353466", LocalDate.of(1998,2,12));
		
		playerManager.add(gonca);
		playerManager.add(caner);
		playerManager.add(agit);
		playerManager.add(ali);
		
		GameManager gameManager = new GameManager();
		Game fifa = new Game(1, "Fifa 21", 500);
		Game gta = new Game(2, "GTA", 300);
		Game needForSpeed = new Game(3, "Need For Speed", 350);
		gameManager.add(fifa);
		gameManager.add(gta);
	
		SalesManager salesManager = new SalesManager();
		salesManager.buy(gonca, fifa);
		salesManager.buy(gonca, gta);
		salesManager.buy(ali, fifa);
		salesManager.buy(caner, gta);
		salesManager.buy(agit, needForSpeed);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign ogrenciKampanyasi = new Campaign(1, "Öðrenci Kampanyasý", 10); 
		Campaign yeniYilKampanyasi = new Campaign(2, "Yeni Yýl Kampanyasý", 15);
		campaignManager.add(yeniYilKampanyasi);
		campaignManager.add(ogrenciKampanyasi);
		campaignManager.update(yeniYilKampanyasi);
		campaignManager.applyCampaign(yeniYilKampanyasi, ali, needForSpeed);
		campaignManager.applyCampaign(ogrenciKampanyasi, gonca, fifa);

	}

}
