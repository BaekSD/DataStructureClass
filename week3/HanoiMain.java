package dataStructure;

public class HanoiMain {
	public static void main(String[] args) {
		HanoiTower hanoi = new HanoiTower(5);
		
		System.out.println("###### 이동 전 상태 ######");
		hanoi.printHanoi();
		System.out.println("#######################");
		
		hanoi.move();
		
		System.out.println("\n");
		System.out.println("###### 이동 후 상태 ######");
		hanoi.printHanoi();
		System.out.println("#######################");
		
		System.out.println("\n이동 횟수 : "+hanoi.numOfMove);
	}
}
