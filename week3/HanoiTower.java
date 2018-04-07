package dataStructure;

public class HanoiTower {
	ArrayStack as[] = new ArrayStack[3];
	int numOfMove=0, num=0;
	
	public HanoiTower(int num) {
		for(int i=0; i<3; i++) {
			as[i] = new ArrayStack(10);
		}
		for(int i=0; i<num; i++) {
			as[0].push(num-i);
		}
		System.out.println("num of disk : "+num);
		
		this.num = num;
	}
	
	public void moveTo(ArrayStack from, ArrayStack to, ArrayStack tmp, int num) {
		if(num == 1) {
			to.push(from.pop());
		} else {
			moveTo(from, tmp, to, num-1);
			to.push(from.pop());
			moveTo(tmp, to, from, num-1);
		}
		numOfMove++;
	}
	
	public void move() {
		moveTo(as[0], as[2], as[1], num);
	}
	
	public void printHanoi() {
		int pop=0;
		for(int i=0; i<as.length; i++) {
			System.out.println((i+1)+"번");
			as[i].printArrayStack();
			System.out.println();
		}
	}
}
