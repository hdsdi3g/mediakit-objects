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
import static tv.hd3g.mediakit.objects.PreviewType.BOOK;
import static tv.hd3g.mediakit.objects.PreviewType.VIDEO_HD;

import java.net.URI;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssetPreviewTest {

	AssetPreview ap;
	Object o;
	URI assetLocation;
	int index;

	@BeforeEach
	void init() throws Exception {
		ap = new AssetPreview();
		o = new Object();
		assetLocation = new URI("file://somewhere");
		index = new Random().nextInt();
	}

	@Test
	void testSetOptions() {
		ap.setOptions(o);
		assertEquals(o, ap.getOptions());
	}

	@Test
	void testGetOptions() {
		assertNull(ap.getOptions());
	}

	@Test
	void testSetIndex() {
		ap.setIndex(index);
		assertEquals(index, ap.getIndex());
	}

	@Test
	void testGetIndex() {
		assertEquals(0, ap.getIndex());
	}

	@Test
	void testSetType() {
		ap.setType(VIDEO_HD);
		assertEquals(VIDEO_HD, ap.getType());
	}

	@Test
	void testGetType() {
		assertNull(ap.getType());
	}

	@Test
	void testToString() {
		assertEquals("null#0[null]", ap.toString());
		ap.setAssetLocation(assetLocation);
		ap.setType(VIDEO_HD);
		ap.setIndex(42);
		assertEquals("VIDEO_HD#42[" + assetLocation.toString() + "]", ap.toString());
	}

	@Test
	void testHashCode() {
		assertNotEquals(0, ap.hashCode());

		ap.setOptions(o);
		assertNotEquals(0, ap.hashCode());

		final var ap2 = new AssetPreview();
		ap2.setOptions(o);
		assertEquals(ap.hashCode(), ap2.hashCode());

		ap.setAssetLocation(assetLocation);
		ap2.setAssetLocation(assetLocation);
		assertEquals(ap.hashCode(), ap2.hashCode());

		ap.setType(VIDEO_HD);
		ap2.setType(VIDEO_HD);
		assertEquals(ap.hashCode(), ap2.hashCode());
	}

	@Test
	void testEqualsObject() {
		ap.setOptions(o);
		final var ap2 = new AssetPreview();
		ap2.setOptions(o);
		assertEquals(ap, ap2);

		ap.setAssetLocation(assetLocation);
		ap2.setAssetLocation(assetLocation);
		assertEquals(ap, ap2);

		ap.setType(BOOK);
		ap2.setType(BOOK);
		assertEquals(ap, ap2);
	}

}
