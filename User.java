package ecommerce;

public class User {

	
	public User(String userName, double userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	private String userName;
	private double userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(double userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(userPassword);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (Double.doubleToLongBits(userPassword) != Double.doubleToLongBits(other.userPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
