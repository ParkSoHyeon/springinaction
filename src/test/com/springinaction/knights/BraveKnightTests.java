package com.springinaction.knights;

import com.springinaction.kights.BraveKight;
import com.springinaction.kights.Minstrel;
import com.springinaction.kights.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BraveKnightTests {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        Minstrel mockMinstrel = mock(Minstrel.class);

        BraveKight knight = new BraveKight(mockQuest, mockMinstrel);

        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }

}
