package com.springinaction.kights;

public class BraveKight implements Knight {
    private Quest quest;
    private Minstrel minstrel;

    public BraveKight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
