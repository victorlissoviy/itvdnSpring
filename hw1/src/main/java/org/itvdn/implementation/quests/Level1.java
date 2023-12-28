package org.itvdn.implementation.quests;

import org.itvdn.interfaces.Quest;

public class Level1 implements Quest {
	@Override
	public void done() {
		System.out.println("Level 1 done");
	}
}
