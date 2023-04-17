package week05;

public class PropertyEx {
	private String jbdcDriver;
	private String jbdcUrl;
	private String username;
	private String password;
	
	public void setJbdcDriver(String jbdcDriver) {
		this.jbdcDriver = jbdcDriver;
	}
	
	public void setJbdcUrl(String jbdcUrl) {
		this.jbdcUrl = jbdcUrl;
	}
	
	public void setUseername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PropertyEx [jbdcDriver=" + jbdcDriver + ", jbdcUrl=" + jbdcUrl + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
