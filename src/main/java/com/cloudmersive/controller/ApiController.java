package com.cloudmersive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cloudmersive.dto.movingAverageDTO;
import com.cloudmersive.service.math;

import java.util.Map;

@RestController
@RequestMapping("/math")
public class ApiController {

	@Autowired
	private math math;

	@PostMapping("/movingAverage")
	public Map<String, Object> movingAverage(@RequestBody movingAverageDTO input) {
		// Assumed Data type is always Integer
		int windowSize = input.getWindowSize();
		int[] nums = input.getData();
		if (windowSize > nums.length || nums.length == 0 || windowSize == 0) {
			// return invalid input
			return Map.of("message", "invalid input");
		}
		float[] resp = math.movingAverage(nums, windowSize);
		return Map.of(
				"message", "success",
				"output", resp);

	}

}