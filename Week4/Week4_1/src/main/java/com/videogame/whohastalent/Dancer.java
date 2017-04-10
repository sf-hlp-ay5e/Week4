package com.videogame.whohastalent;

class Dancer extends Performer {
	DanceStyle danceStyle;
	
	Dancer(DanceStyle danceStyle) {
		this.setDanceStyle(danceStyle);
	}

	public DanceStyle getDanceStyle() {
		return danceStyle;
	}

	public void setDanceStyle(DanceStyle danceStyle) {
		this.danceStyle = danceStyle;
	}

}
