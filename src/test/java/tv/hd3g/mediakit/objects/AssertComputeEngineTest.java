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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class AssertComputeEngineTest {

	@Mock
	Map<String, Object> datas;
	@Mock
	List<ComputedRenderedAsset> renderedList;

	AssertComputeEngine assertComputeEngine;

	@BeforeEach
	void init() throws Exception {
		MockitoAnnotations.openMocks(this).close();
		assertComputeEngine = new AssertComputeEngine();
	}

	@AfterEach
	void end() {
		Mockito.verifyNoMoreInteractions(datas, renderedList);
	}

	@Test
	void testHashCode() {
		final var other = new AssertComputeEngine();
		assertEquals(other.hashCode(), assertComputeEngine.hashCode());

		assertComputeEngine.setDatas(datas);
		assertComputeEngine.setRenderedList(renderedList);
		assertComputeEngine.setSensibleDatas(true);

		other.setDatas(datas);
		other.setRenderedList(renderedList);
		other.setSensibleDatas(true);

		assertEquals(other.hashCode(), assertComputeEngine.hashCode());
	}

	@Test
	void testEqualsObject() {
		final var other = new AssertComputeEngine();
		assertEquals(other, assertComputeEngine);

		assertComputeEngine.setDatas(datas);
		assertComputeEngine.setRenderedList(renderedList);
		assertComputeEngine.setSensibleDatas(true);

		other.setDatas(datas);
		other.setRenderedList(renderedList);
		other.setSensibleDatas(true);

		assertEquals(other, assertComputeEngine);
	}

	@Test
	void testGetDatas() {
		assertNull(assertComputeEngine.getDatas());
	}

	@Test
	void testSetDatas() {
		assertComputeEngine.setDatas(datas);
		assertEquals(datas, assertComputeEngine.getDatas());
	}

	@Test
	void testIsSensibleDatas() {
		assertFalse(assertComputeEngine.isSensibleDatas());
	}

	@Test
	void testSetSensibleDatas() {
		assertComputeEngine.setSensibleDatas(true);
		assertTrue(assertComputeEngine.isSensibleDatas());
	}

	@Test
	void testGetRenderedList() {
		assertNull(assertComputeEngine.getRenderedList());
	}

	@Test
	void testSetRenderedList() {
		assertComputeEngine.setRenderedList(renderedList);
		assertEquals(renderedList, assertComputeEngine.getRenderedList());
	}

}
