package com.videogame.whohastalent;

import java.util.ArrayList;
import java.util.List;

public class Audition {

	List<Performer> performerList;

	public Audition() {
		super();
		performerList = new ArrayList<Performer>(0);
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Dancer(DanceStyle.TAP));
		performerList.add(new Dancer(DanceStyle.BALLET));
		performerList.add(new Vocalist(MusicalKey.A));
		
	}
	
	public String performAll() {
		String performance = "";
		for (Performer performer : performerList) {
			performance += performer.perform() + "\n";
		}
		return performance;
	}

}
