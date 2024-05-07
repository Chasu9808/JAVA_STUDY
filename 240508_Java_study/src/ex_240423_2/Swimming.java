package ex_240423_2;

public class Swimming {
	// 전역 상수 
	public static final String COMMENT = "새벽 수영 재미 있지만, 힘들어요. 잠도 오고 어깨도 아프고";
	
	// 전역 메서드 
	public static void showComment() {
		System.out.println("궁시렁 : " + COMMENT);
		
	}
	
	// 설계 도면으로 사용할 예정. 
//	sportsName : 
//		sportsMember :
//		sportsSeason : 
	// 인스턴스 멤버 vs 스태틱 멤버
	// private 캡슐화, 보호하기. 안보임. 그러니 사용 못함. 
	private String sportsName;
	private String sportsMember;
	private String sportsSeason;
	
	// 멤버에 값을 설정하거나, 값을 가져오는 메서드 만들기. getter/setter
	// 생성자를 3개 형식으로 만들면, 따로 세터는 필요없음. 
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsMember() {
		return sportsMember;
	}
	public void setSportsMember(String sportsMember) {
		this.sportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return sportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.sportsSeason = sportsSeason;
	}
	
	// 인스턴스 메서드.
	// 해당 정보를 다 출력하는 메서드 
	public void showInfo() {
		System.out.println("sportsName : " + this.sportsName  + ", "
				+ "sportsMember : "+ this.sportsMember +", sportsSeason :" +
				this.sportsSeason);
		
	}
	
	
	//toString, Object 최고 상위 클래스를 모든 클래스가 상속 받고 있고, 
	// 여기에 toString 메서드가 있지만, 기능이: 필요없는 메모리 위치 주솟값을 호출해서, 안씀. 
	// 그래서, 우리가 자주 쓰는 실제 데이터를 출력하는 기능으로 재정의해서 사용함. 
	
	@Override
	public String toString() {
		return "Swimming [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason="
				+ sportsSeason + "]";
	}
}






