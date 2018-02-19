package com.hb.am;

class Car{

	int speed;
	int max;
	String color;
	
	public Car(String c, int a) {
		speed=0;
		max=a;
		color=c;
	}
	
	public Car(int a) {
		speed=0;
		max=a;
		color="검정색";
	}
	
	public void speedUp(int a) {
		if(speed+a<=max){
		speed+=a;
		}else speed=max;
	}
	
	public void speedDown(int a) {
		speed-=a;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car c1 = new Car(50);
		System.out.println(c1.color+" 차의 현재 속도는 "+c1.speed);
		c1.speedUp(10);
		System.out.println("현재 속도는 "+c1.speed);
		c1.speedUp(20);
		System.out.println("현재 속도는 "+c1.speed);
		c1.speedUp(30);
		System.out.println("현재 속도는 "+c1.speed);
		
		c1=new Car(150);
		c1.speedUp(50);
		System.out.println("현재 속도는 "+c1.speed);
		c1.speedUp(60);
		System.out.println("현재 속도는 "+c1.speed);
		

	}

}
