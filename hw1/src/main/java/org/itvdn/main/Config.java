package org.itvdn.main;

import org.itvdn.implementation.Knight;
import org.itvdn.implementation.quests.Boss;
import org.itvdn.implementation.quests.Level1;
import org.itvdn.implementation.quests.Tutorial;
import org.itvdn.interfaces.Quest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean("boss")
	public Quest quest() {
		return new Boss();
	}

	@Bean("tutorial")
	public Quest tutorial() {
		return new Tutorial();
	}

	@Bean("level")
	public Quest level() {
		return new Level1();
	}

	@Bean
	public Knight myKnight(@Qualifier("level") Quest lastQ) {
		return new Knight(lastQ);
	}
}
