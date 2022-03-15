package com.blz.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyzeMood();
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
		assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyzeMood();
			assertEquals("Happy", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenNullMood_ShouldReturnHappy() {
		String mood = null;
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			mood = moodAnalyser.analyzeMood();
			assertEquals("Happy", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmptyMood_ShouldReturnHappy() {
		String mood = null;
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			mood = moodAnalyser.analyzeMood();
			assertEquals("Happy", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e);
		}
	}
}
