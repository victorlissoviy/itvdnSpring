package org.itvdn.implementation.quests;

import org.itvdn.interfaces.Quest;

public class Tutorial implements Quest {

	@Override
	public void done() {
		System.out.println("Tutorial done");
	}
}
