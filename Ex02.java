package com.hb.am;

public class Ex02 {

	//생성자 - 필드의 초기화(대표적인 기능)
	//오버로딩 가능(대상은 메소드, 필드X)
	int sum;
	
	public Ex02(){
		
	}
	
	public Ex02(int a){
		System.out.println("생성자 발동");
		sum=a;
	}	

	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		System.out.println("sum="+me.sum);
		me = new Ex02(1004);
		System.out.println("sum="+me.sum);

	}

}
