/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author ralexander
 *
 */
public class DataManager {

	String Dtext="";

	DataManager() {}

	public String getHello() {
		return "Hello";
	}
	public String getHowdy() {
		return "Howdy";
	}
	public String getChinese() {
		return "Chinese";
	}
	public void setText(String text) {
		this.Dtext=text;
	}
}