package com.blz.MoodAnalyser;

public class MoodAnalyser {

	private String msg;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() throws MoodAnalyserException {
		try {
			if (msg.contains("Sad")) {
				return "Sad";
			}
			return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}
