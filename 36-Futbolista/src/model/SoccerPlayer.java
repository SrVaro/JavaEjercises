package model;

public class SoccerPlayer {

	private Team team;
	private Position position;
	private String name;

	public SoccerPlayer(Team team, Position position, String name) {
		super();
		this.team = team;
		this.position = position;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
