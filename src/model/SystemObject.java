package model;

public abstract class SystemObject{
	private boolean enabled;
	protected String name;
	
	public SystemObject(String name) {
		enabled = true;
		this.name=name;
	}
	
	
	//Getters
	
	/**
	* @return A boolean that indicates if the object is enabled or not.<br>
	*/
	public boolean isEnabled() {
		return enabled;
	}
	/**
	* @return A String that indicates the name.<br>
	*/
	public String getName() {
		return name;
	}
	
	
	//Setters
	
	/**
	 * @param enabled The indication that the object is enabled or not
	 */
	public void setEnabled(boolean enabled) {
		this.enabled=enabled;
	}
	
	/**
	 * @param name The name of the object
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	public abstract String showInformation();
	
}