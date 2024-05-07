package ex_240423;

public class StarCraft_BattleNet_Asia {

	public static void main(String[] args) {
		System.out.println("스타크래프트로 자바의 기본 객체 순서 및, 게터 세터, 함수등 해보기");
		// 작업 순서1, 저그 객체를 생성한다. 
		Zerg zerg1 = new Zerg();
		// 작업 순서2, 드론을 만들기. 
		zerg1.setDrone("9드론 생산함");
		// 작업 순서3, 드론으로 미네랄 , 가스 채취하기. 
		zerg1.makeMoney();
		// 작업 순서4, 드론으로 정찰 보내기, 상대 종족, 날빌?, 운영?
		zerg1.patrolDrone();
		// 작업 순서5, 전략 선택하기. 
		String lsyZergStrategy = "이상용씨는 오늘도 주말 새벽 아침부터 저그에 온힘을 다하고 있다. "
				+ "초반 정찰시 상대가 12앞 프로토스로 포지도 안짓고 있어서, 아싸리, 4드론을 간다.";
		zerg1.selectStrategy(lsyZergStrategy);
		
		System.out.println("오늘도 이상용씨는 주말 아침마다, 새벽에 몰래 게임하는 방법만 연구하는 중인가? 공부는 안함?  ");
		

	}

}





