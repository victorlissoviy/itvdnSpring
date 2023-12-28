package org.itvdn.implementation;

import org.itvdn.interfaces.Quest;

public class Knight {

	private final Quest quest;

	public Quest getQuest() {
		return quest;
	}

	public Knight(Quest quest) {
		this.quest = quest;
	}

	public void doneQuest() {
		quest.done();
	}
}
