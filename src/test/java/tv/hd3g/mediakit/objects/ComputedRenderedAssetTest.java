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

class ComputedRenderedAssetTest {

	@Mock
	Map<String, Object> options;
	@Mock
	Map<String, String> hash;
	String type;
	String engineProducerName;
	String mime;
	long date;
	long size;

	ComputedRenderedAsset computedRenderedAsset;

	@BeforeEach
	void init() throws Exception {
		MockitoAnnotations.openMocks(this).close();

		type = String.valueOf(System.nanoTime());
		engineProducerName = String.valueOf(System.nanoTime());
		mime = String.valueOf(System.nanoTime());
		date = System.nanoTime();
		size = System.nanoTime();

		computedRenderedAsset = new ComputedRenderedAsset();
	}

	@AfterEach
	void end() {
		Mockito.verifyNoMoreInteractions(options);
	}

	@Test
	void testHashCode() {
		final var other = new ComputedRenderedAsset();
		assertEquals(other.hashCode(), computedRenderedAsset.hashCode());

		computedRenderedAsset.setOptions(options);
		computedRenderedAsset.setDate(date);
		computedRenderedAsset.setEngineProducerName(engineProducerName);
		computedRenderedAsset.setHash(hash);
		computedRenderedAsset.setMime(mime);
		computedRenderedAsset.setSize(size);
		computedRenderedAsset.setType(type);

		other.setOptions(options);
		other.setDate(date);
		other.setEngineProducerName(engineProducerName);
		other.setHash(hash);
		other.setMime(mime);
		other.setSize(size);
		other.setType(type);

		assertEquals(other.hashCode(), computedRenderedAsset.hashCode());
	}

	@Test
	void testEqualsObject() {
		final var other = new ComputedRenderedAsset();
		assertEquals(other, computedRenderedAsset);

		computedRenderedAsset.setOptions(options);
		computedRenderedAsset.setDate(date);
		computedRenderedAsset.setEngineProducerName(engineProducerName);
		computedRenderedAsset.setHash(hash);
		computedRenderedAsset.setMime(mime);
		computedRenderedAsset.setSize(size);
		computedRenderedAsset.setType(type);

		other.setOptions(options);
		other.setDate(date);
		other.setEngineProducerName(engineProducerName);
		other.setHash(hash);
		other.setMime(mime);
		other.setSize(size);
		other.setType(type);

		assertEquals(other, computedRenderedAsset);
	}

	@Test
	void testGetType() {
		assertNull(computedRenderedAsset.getType());
	}

	@Test
	void testSetType() {
		computedRenderedAsset.setType(type);
		assertEquals(type, computedRenderedAsset.getType());
	}

	@Test
	void testGetHash() {
		assertNull(computedRenderedAsset.getHash());
	}

	@Test
	void testSetHash() {
		computedRenderedAsset.setHash(hash);
		assertEquals(hash, computedRenderedAsset.getHash());
	}

	@Test
	void testGetEngineProducerName() {
		assertNull(computedRenderedAsset.getEngineProducerName());

	}

	@Test
	void testSetEngineProducerName() {
		computedRenderedAsset.setEngineProducerName(engineProducerName);
		assertEquals(engineProducerName, computedRenderedAsset.getEngineProducerName());
	}

	@Test
	void testGetMime() {
		assertNull(computedRenderedAsset.getMime());
	}

	@Test
	void testSetMime() {
		computedRenderedAsset.setMime(mime);
		assertEquals(mime, computedRenderedAsset.getMime());
	}

	@Test
	void testGetDate() {
		assertEquals(0, computedRenderedAsset.getDate());
	}

	@Test
	void testSetDate() {
		computedRenderedAsset.setDate(date);
		assertEquals(date, computedRenderedAsset.getDate());
	}

	@Test
	void testGetSize() {
		assertEquals(0, computedRenderedAsset.getSize());
	}

	@Test
	void testSetSize() {
		computedRenderedAsset.setSize(size);
		assertEquals(size, computedRenderedAsset.getSize());
	}

	@Test
	void testGetOptions() {
		assertNull(computedRenderedAsset.getOptions());
	}

	@Test
	void testSetOptions() {
		computedRenderedAsset.setOptions(options);
		assertEquals(options, computedRenderedAsset.getOptions());
	}

}
