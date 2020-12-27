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

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractBaseAssetsTest {

	AbstractBaseAssetsImpl abai;
	URI assetLocation;

	@BeforeEach
	void init() throws Exception {
		abai = new AbstractBaseAssetsImpl();
		assetLocation = new URI("file://somewhere");
	}

	@Test
	void testGetAssertLocation() {
		assertNull(abai.getAssetLocation());
	}

	@Test
	void testSetAssertLocation() throws URISyntaxException {
		abai.setAssetLocation(assetLocation);
		assertEquals(assetLocation, abai.getAssetLocation());
	}

	@Test
	void testHashCode() {
		assertNotEquals(0, abai.hashCode());

		abai.setAssetLocation(assetLocation);
		assertNotEquals(0, abai.hashCode());

		final var abai2 = new AbstractBaseAssetsImpl();
		abai2.setAssetLocation(assetLocation);
		assertEquals(abai.hashCode(), abai2.hashCode());
	}

	@Test
	void testEqualsObject() {
		abai.setAssetLocation(assetLocation);
		final var abai2 = new AbstractBaseAssetsImpl();
		abai2.setAssetLocation(assetLocation);
		assertEquals(abai, abai2);
	}

	@Test
	void testToString() {
		assertEquals("null", abai.toString());
		abai.setAssetLocation(assetLocation);
		assertEquals(assetLocation.toString(), abai.toString());
	}

	static class AbstractBaseAssetsImpl extends AbstractBaseAssets {

	}
}
