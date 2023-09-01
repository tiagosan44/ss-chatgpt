package com.softserve.sschatgpt.service;

import com.softserve.sschatgpt.domain.Player;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerAnalyzerTest {

    @Test
    public void testNormalPlayer() {
        Player player = new Player();
        player.setAge(25);
        player.setExperience(5);
        player.setSkills(Arrays.asList(2, 2, 2));

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(Collections.singletonList(player));

        assertEquals(250.0, result);
    }

    @Test
    public void testJuniorPlayer() {
        Player player = new Player();
        player.setAge(15);
        player.setExperience(3);
        player.setSkills(Arrays.asList(3, 3, 3));

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(Collections.singletonList(player));

        assertEquals(67.5, result);
    }

    @Test
    public void testSeniorPlayer() {
        Player player = new Player();
        player.setAge(35);
        player.setExperience(15);
        player.setSkills(Arrays.asList(4, 4, 4));

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(Collections.singletonList(player));

        assertEquals(2520.0, result);
    }

    @Test
    public void testMultiplePlayers() {
        Player player1 = new Player();
        player1.setAge(25);
        player1.setExperience(5);
        player1.setSkills(Arrays.asList(2, 2, 2));

        Player player2 = new Player();
        player2.setAge(35);
        player2.setExperience(15);
        player2.setSkills(Arrays.asList(4, 4, 4));

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(Arrays.asList(player1, player2));

        assertEquals(2770.0, result);  // 250 + 2520
    }

    @Test
    public void testSkillsIsNull() {
        Player player = new Player();
        player.setAge(25);
        player.setExperience(5);
        player.setSkills(null);

        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        assertThrows(NullPointerException.class, () -> {
            analyzer.calculateScore(Collections.singletonList(player));
        });
    }

    @Test
    public void testEmptyArray() {
        PlayerAnalyzer analyzer = new PlayerAnalyzer();
        double result = analyzer.calculateScore(Collections.emptyList());

        assertEquals(0.0, result);
    }
}