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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static tv.hd3g.mediakit.objects.OriginAssetKind.TEST_CONTENT;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OriginAssetTest {

	OriginAsset oa;
	UUID u;

	@BeforeEach
	void init() throws Exception {
		oa = new OriginAsset();
		u = UUID.randomUUID();
	}

	@Test
	void testHashCode() {
		assertEquals(31, oa.hashCode());
		oa.setReference(u);
		assertNotEquals(31, oa.hashCode());

		final var oa2 = new OriginAsset();
		oa2.setReference(u);
		assertEquals(oa.hashCode(), oa2.hashCode());
	}

	@Test
	void testCreate() throws URISyntaxException {
		final var uri = new URI("file://somewhere");
		oa = OriginAsset.create("a name", uri, TEST_CONTENT);
		assertNotNull(oa.getReference());
		assertEquals("a name", oa.getName());
		assertEquals(uri, oa.getAssetLocation());
		assertEquals(TEST_CONTENT, oa.getKind());
		assertNull(oa.getExternalReferences());
	}

	@Test
	void testGetReference() {
		assertNull(oa.getReference());
	}

	@Test
	void testSetReference() {
		oa.setReference(u);
		assertEquals(u, oa.getReference());
	}

	@Test
	void testGetExternalReferences() {
		assertNull(oa.getExternalReferences());
	}

	@Test
	void testSetExternalReferences() {
		oa.setExternalReferences(Map.of("a", "b", "c", "d"));
		assertEquals(Map.of("a", "b", "c", "d"), oa.getExternalReferences());
	}

	@Test
	void testGetName() {
		assertNull(oa.getName());
	}

	@Test
	void testSetName() {
		oa.setName("a name");
		assertEquals("a name", oa.getName());
	}

	@Test
	void testGetKind() {
		assertNull(oa.getKind());
	}

	@Test
	void testSetKind() {
		oa.setKind(TEST_CONTENT);
		assertEquals(TEST_CONTENT, oa.getKind());
	}

	@Test
	void testToString() {
		assertEquals("<?>", oa.toString());
		oa.setReference(u);
		assertEquals(u.toString(), oa.toString());
		oa.setName("text");
		assertEquals(u.toString() + "[text]", oa.toString());
	}

	@Test
	void testEqualsObject() {
		oa.setReference(u);
		final var oa2 = new OriginAsset();
		oa2.setReference(u);
		assertEquals(oa, oa2);
	}
}
