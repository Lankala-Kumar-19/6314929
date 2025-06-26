package mocktitoExercise;

public class Data {
	private int id;
	private String des;
	
	public Data(int id,String des) {
		this.id=id;
		this.des=des;
	}
	public String toString() {
		return "ID: "+id+"	Description: "+des;	
	}
	
}
