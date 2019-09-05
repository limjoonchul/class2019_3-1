package kr.ac.daelim.uml;

public class Marine extends Unit {
	public String name;
	public int health;
	public int attackPower;
	public void move() {
		System.out.println("유닛이 이동한다");
	}
	public void underAttack(Chactor charactor) {
		
		System.out.println("유닛이 공격받는다.");
	}
	
	public void Attack() {
		
		System.out.println("유닛이 공격한다.");
	}




}
