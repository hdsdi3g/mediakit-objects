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
 * Copyright (C) hdsdi3g for hd3g.tv 2020
 *
 */
package tv.hd3g.mediakit.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssetSummaryTest {

	AssetSummary as;

	@BeforeEach
	void init() throws Exception {
		as = new AssetSummary();
	}

	@Test
	void testHashCode() {
		final var as0 = new AssetSummary();
		assertEquals(as.hashCode(), as0.hashCode());

		as.setMimeCode("app/oct-str");
		as0.setMimeCode("app/oct-str");
		assertEquals(as.hashCode(), as0.hashCode());

		as.setAnalysersAbstracts(Map.of("a", "b", "c", "d"));
		as0.setAnalysersAbstracts(Map.of("a", "b", "c", "d"));
		assertEquals(as.hashCode(), as0.hashCode());

		as.setPreviews(List.of(new AssetPreview()));
		as0.setPreviews(List.of(new AssetPreview()));
		assertEquals(as.hashCode(), as0.hashCode());

		as.setMasterAsPreview(new AssetPreview());
		as0.setMasterAsPreview(new AssetPreview());
		assertEquals(as.hashCode(), as0.hashCode());
	}

	@Test
	void testGetMimeCode() {
		assertNull(as.getMimeCode());
	}

	@Test
	void testSetMimeCode() {
		as.setMimeCode("app/oct-str");
		assertEquals("app/oct-str", as.getMimeCode());
	}

	@Test
	void testGetAnalysersAbstracts() {
		assertNull(as.getAnalysersAbstracts());
	}

	@Test
	void testSetAnalysersAbstracts() {
		as.setAnalysersAbstracts(Map.of("a", "b", "c", "d"));
		assertEquals(Map.of("a", "b", "c", "d"), as.getAnalysersAbstracts());
	}

	@Test
	void testGetPreviews() {
		assertNull(as.getPreviews());
	}

	@Test
	void testSetPreviews() {
		as.setPreviews(List.of(new AssetPreview()));
		assertEquals(List.of(new AssetPreview()), as.getPreviews());
	}

	@Test
	void testGetMasterAsPreview() {
		assertNull(as.getMasterAsPreview());
	}

	@Test
	void testSetMasterAsPreview() {
		as.setMasterAsPreview(new AssetPreview());
		assertEquals(new AssetPreview(), as.getMasterAsPreview());
	}

	@Test
	void testEqualsObject() {
		assertNotEquals(null, as);
		assertEquals(as, as);

		final var as0 = new AssetSummary();
		assertEquals(as, as0);

		as.setMimeCode("app/oct-str");
		as0.setMimeCode("app/oct-str");
		assertEquals(as, as0);

		as.setAnalysersAbstracts(Map.of("a", "b", "c", "d"));
		as0.setAnalysersAbstracts(Map.of("a", "b", "c", "d"));
		assertEquals(as, as0);

		as.setPreviews(List.of(new AssetPreview()));
		as0.setPreviews(List.of(new AssetPreview()));
		assertEquals(as, as0);

		as.setMasterAsPreview(new AssetPreview());
		as0.setMasterAsPreview(new AssetPreview());
		assertEquals(as, as0);
	}
}
