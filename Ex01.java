package com.hb.am;


class bike{
/*
	Ŭ������ �������
	1.�޼���
	2.����
	3.������
*/
	
	//��ü�� �Ӽ� - ��ü Ư��
	public int nowSpeed=0;
	public String color="���";
	public int maxSpeed=100;
	
	//������
	public bike(String a, int b){
		color=a;
		maxSpeed=b;
	}
	
	public void run() {
		System.out.println("������");		
	}
	
	public void stop() {
		System.out.println("����");
	}

	//��ü�� ��� - ��ü ����
	public int speedUp(int speed) {
		if(nowSpeed+speed<=maxSpeed)
		nowSpeed+=speed;
		System.out.println(color+"�� ����ũ�� ���� �ӵ��� "+nowSpeed+"km �Դϴ�.");
		return nowSpeed;
	}
	
	public int speedDown(int speed) {
		nowSpeed-=speed;
		System.out.println(color+"�� ����ũ�� ���� �ӵ��� "+nowSpeed+"km �Դϴ�.");
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
		by.color="����";
		by.speedUp(50);
		by.speedUp(50);
		by.speedUp(50);
		by.speedUp(50);
	*/
		
		bike me = new bike("���", 150);
//		me.color="���";
//		me.maxSpeed=150;
		
		bike you = new bike("����", 100);
//		you.color="����";
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
