package com.cloudmersive.dto;

public class movingAverageDTO {
	int[] data;
	int windowSize;

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getWindowSize() {
		return windowSize;
	}

	public void setWindowSize(int windowSize) {
		this.windowSize = windowSize;
	}
}
