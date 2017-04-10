package com.videogame.whohastalent;

class Vocalist extends Performer {
	
	MusicalKey musicalKey;
	
	Vocalist(MusicalKey musicalKey) {
		this.setMusicalKey(musicalKey);
	}

	public MusicalKey getMusicalKey() {
		return musicalKey;
	}

	public void setMusicalKey(MusicalKey musicalKey) {
		this.musicalKey = musicalKey;
	}

}
