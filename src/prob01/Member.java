package prob01;


public class Member {
	private String id;
	private String name;
	private int point;
	public String setName(String name) {
		return this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public int setPoing(int point) {
		return this.point=point;
	}
	
	
	public String setId(String id) {
		return this.id=id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	
	
	
}
