package com.videogame.whohastalent;

import java.util.ArrayList;
import java.util.List;

public class Audition {

	List<Performer> performerList;

	public Audition() {
		super();
		performerList = new ArrayList<Performer>();
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Dancer(DanceStyle.JIG));
		performerList.add(new Dancer(DanceStyle.BALLET));
		performerList.add(new Vocalist(MusicalKey.A));
		
	}

}
