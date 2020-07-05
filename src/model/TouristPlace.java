package model;
public class TouristPlace {
	private String name;
	private String destination;
	private String rank;
	public String getName() {
		return name;
	}
	public String getDestination() {
		return destination;
	}
	public String getRank() {
		return rank;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	TouristPlace(String name, String destination, String rank) {
		this.name=name;
		this.destination=destination;
		this.rank=rank;
	}
	
	
}
