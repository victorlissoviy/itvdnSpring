package org.itvdn.implementation.quests;

import org.itvdn.interfaces.Quest;

public class Boss implements Quest {
	@Override
	public void done() {
		System.out.println("Boss level done");
	}
}
