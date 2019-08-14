package navegation.example;

import java.io.Serializable;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Validator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 253531302020868817L;
	private int tries;
	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTries() {
		return tries;
	}

	public void setTries(int tries) {
		this.tries = tries;
	}

	public String getResponse() {
		return user;
	}

	public void setResponse(String newValue) {
		user = newValue;
	}

	public String answerAction() {
		tries++;
		if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {

			return "success";
		} else {

			return "failure";
		}
	}

}
