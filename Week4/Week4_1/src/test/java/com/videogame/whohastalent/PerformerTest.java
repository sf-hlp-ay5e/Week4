package com.videogame.whohastalent;

import org.junit.Before;
import org.junit.Test;

public class PerformerTest {

	Performer performer;
	
	@Before
	public void setup() {
		performer = new Performer();
	}

	@Test
	public void testGoodPerform() {
		assert(performer.perform().endsWith("performer"));
	}

}
