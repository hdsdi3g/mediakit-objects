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

public enum OriginAssetKind {
	/**
	 * The asset media source is from an internal production. There may not be a copy elsewhere.
	 */
	ORIGINAL_CONTENT,
	/**
	 * The asset media source is from an external production. There is surely a copy elsewhere.
	 */
	IMPORTED_CONTENT,
	/**
	 * The asset media is only for test/debug purposes.
	 */
	TEST_CONTENT,
	/**
	 * The status is not set/known.
	 */
	UNKNOWN;
}
