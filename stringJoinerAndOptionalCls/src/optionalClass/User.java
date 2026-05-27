package optionalClass;
import java.util.Optional;

public class User {
	
	public String getUserName(Integer id) {
		if(id == 10) {
			return "Vivek";
		}else if (id == 20) {
			return "gudulu";
		}else if (id == 30) {
			return "madana";
		}else {
			return null;
		}	
		}
	
	public Optional<String> getUserNameByUserId(Integer uid){
		String name  = null;
		if(uid == 101) {
			name = "alice";
		}else if (uid == 201) {
			name = "bob";
		}else if (uid == 301) {
			name ="charlie";
		}
			return Optional.ofNullable(name);
		}
		
	}


