import java.util.ArrayList;

public class Player {

	public Integer number;

	public ArrayList<String> MoveList = new ArrayList<String>();

	public Player(Integer i) {
		this.number = i;
	}

	public void move(String from, String to) {
		MoveList.add(from + "-" + to);
	}

}
