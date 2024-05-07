package ex_240425.homework.NamGwiYeon;

public class NamGwiYeonpanda extends NamGwiYeonAnimal{
	
	private String place;
	private String family;
	
	
	//getter /setter
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	
	public void hobby(String h) {
		System.out.println("판다의 취미 : "+h);
	}
	public void dream(String d) {
		System.out.println("판다의 꿈 : "+d);
	}
	
}
