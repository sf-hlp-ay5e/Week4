package com.videogame.whohastalent;

class Performer {
	
	long unionId;
	
	public Performer() {
		this( (long) ((Math.random() * 999) + 1) );
	}
	
	public Performer(Long unionId) {
//		System.out.println("Created with union ID = " + unionId);
		this.setUnionId(unionId);
	}

	String perform() {
		String performance = getUnionId() + " - performer";
		return performance;
	}

	public long getUnionId() {
		return unionId;
	}

	public void setUnionId(long unionId) {
		this.unionId = unionId;
	}

}
