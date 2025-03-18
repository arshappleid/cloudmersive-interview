package com.cloudmersive.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class math {
	// Expected valid input
	public static float[] movingAverage(int[] nums, int windowSize) {

		int n = nums.length;
		int startWindow = 0;
		float[] resp = new float[n - windowSize + 1];
		float sum = 0.0f;
		for (int endWindow = 0; endWindow < n; endWindow++) {
			sum += nums[endWindow];
			// Build up the window Size
			if (endWindow - startWindow < windowSize - 1) {
				continue;
			} else {
				// calculate the average, and increment the start window
				resp[startWindow] = sum / windowSize;
				// System.out.println("Start Window " + startWindow);
				// System.out.println("End Window " + endWindo);
				// System.out.println("Average " + resp[startWindow]);
				// System.out.println();

				// Progress the window forward
				sum -= nums[startWindow];
				startWindow++;
			}
		}
		return resp;
	}
}
