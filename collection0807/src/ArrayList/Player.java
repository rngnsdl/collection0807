package ArrayList;

public class Player { //�� Ŭ������ �����Ұ��� ����
	private String name;
	private int score;
	private int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Player(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
