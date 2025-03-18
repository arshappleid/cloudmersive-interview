package com.cloudmersive.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.cloudmersive.service.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class mathTest {

	@Autowired
	public math math;

	@Test
	public void testMovingAverage_ValidInput1() {
		int[] data = { 1, 2, 3, 4, 5 };
		int windowSize = 3;
		float[] expected = { 2.0f, 3.0f, 4.0f };
		float[] actual = com.cloudmersive.service.math.movingAverage(data, windowSize);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testMovingAverage_ValidInput2() {
		int[] data = { 1, 2, 3 };
		int windowSize = 3;
		float[] expected = { 2.0f };
		float[] actual = com.cloudmersive.service.math.movingAverage(data, windowSize);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testMovingAverage_ValidInput3() {
		int[] data = { 1 };
		int windowSize = 1;
		float[] expected = { 1.0f };
		float[] actual = com.cloudmersive.service.math.movingAverage(data, windowSize);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testMovingAverage_inValidInput() {
		int[] data = { 1 };
		int windowSize = 2;
		float[] expected = {};
		float[] actual = com.cloudmersive.service.math.movingAverage(data, windowSize);
		assertArrayEquals(expected, actual);
	}

}
