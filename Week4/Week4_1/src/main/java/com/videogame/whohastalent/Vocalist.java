package com.videogame.whohastalent;

class Vocalist extends Performer {
	
	MusicalKey musicalKey;
	
	Vocalist(MusicalKey musicalKey) {
		this.setMusicalKey(musicalKey);
	}
	
	@Override
	String perform() {
		String performance = "I sing in the key of - " + getMusicalKey() + " - " + getUnionId();
		return performance;
	}

	String perform(int volume) {
		String performance = "";
		if (volume >= 1 & volume <= 10) {
			performance = "I sing in the key of - " + getMusicalKey() + " - at the volume " + volume + " - " + getUnionId();
		} else {
			performance = "Invalid volume specified (" + volume + ") for performance from singer with Id " + getUnionId() + ".  Must be between 1 and 10, inclusive.";
		}
		return performance;
	}

	public MusicalKey getMusicalKey() {
		return musicalKey;
	}

	public void setMusicalKey(MusicalKey musicalKey) {
		this.musicalKey = musicalKey;
	}

}
