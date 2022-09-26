package OOps;

public class Bus extends Transport{

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	int capacity() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	String Model() {
		// TODO Auto-generated method stub
		return null;
	}
     int cost;
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
