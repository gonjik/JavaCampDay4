

public class Utils {
	


	public static void runValidator(Validator validator,Player player, String message) {
	
		if (validator.validate(player)) {
			System.out.println(message);
		}else{
			System.out.println("Kayýt gerçekleþmedi");
		}
	}
	

}
