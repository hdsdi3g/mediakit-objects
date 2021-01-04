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
package tv.hd3g.mediakit.objects.mtd;

public enum MetadataEntryNormKind {

	/**
	 * A strong, stable and published norm describe the metadata entry.
	 */
	NORMALIZED,
	/**
	 * A vendor/proprietary metadata entry, maybe an non-stable metadata definition.
	 */
	SPECIFIC_VENDOR,
	/**
	 * Reserved for MediaKit use only.
	 */
	INTERNAL_MEDIAKIT,
	/**
	 * For test purpose only.
	 */
	TEST;

}
