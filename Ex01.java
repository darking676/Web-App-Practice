package com.hb.am;


class bike{
/*
	클래스의 구성요소
	1.메서드
	2.변수
	3.생성자
*/
	
	//객체의 속성 - 객체 특성
	public int nowSpeed=0;
	public String color="노랑";
	public int maxSpeed=100;
	
	//생성자
	public bike(String a, int b){
		color=a;
		maxSpeed=b;
	}
	
	public void run() {
		System.out.println("굴러감");		
	}
	
	public void stop() {
		System.out.println("멈춤");
	}

	//객체의 기능 - 객체 제어
	public int speedUp(int speed) {
		if(nowSpeed+speed<=maxSpeed)
		nowSpeed+=speed;
		System.out.println(color+"색 바이크의 현재 속도는 "+nowSpeed+"km 입니다.");
		return nowSpeed;
	}
	
	public int speedDown(int speed) {
		nowSpeed-=speed;
		System.out.println(color+"색 바이크의 현재 속도는 "+nowSpeed+"km 입니다.");
		return nowSpeed;
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
	/*
		bike by=new bike();
		int nowSpeed=0;
		
		by.speedUp(10);
		by.speedUp(20);
		by.speedUp(30);
		by.speedDown(40);
		System.out.println("New Car...");
		by = new bike();
		by.color="빨강";
		by.speedUp(50);
		by.speedUp(50);
		by.speedUp(50);
		by.speedUp(50);
	*/
		
		bike me = new bike("노랑", 150);
//		me.color="노랑";
//		me.maxSpeed=150;
		
		bike you = new bike("빨강", 100);
//		you.color="빨강";
//		you.maxSpeed=100;
		
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(30);
		you.speedUp(30);
		me.speedUp(50);
		you.speedUp(50);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(30);
		you.speedUp(30);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(10);
		you.speedUp(10);
		
		
	}

}
