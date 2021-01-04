/*
 * This file is part of mediakit-objects.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * Copyright (C) hdsdi3g for hd3g.tv 2021
 *
 */
package tv.hd3g.mediakit.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class AssertComputedTest {

	@Mock
	Map<String, AssertComputeEngine> computeResults;
	AssertComputed assertComputed;

	@BeforeEach
	void init() throws Exception {
		MockitoAnnotations.openMocks(this).close();
		assertComputed = new AssertComputed();
	}

	@AfterEach
	void end() {
		Mockito.verifyNoMoreInteractions(computeResults);
	}

	@Test
	void testGetComputeResults() {
		assertNull(assertComputed.getComputeResults());
	}

	@Test
	void testSetComputeResults() {
		assertComputed.setComputeResults(computeResults);
		assertEquals(computeResults, assertComputed.getComputeResults());
	}
}
