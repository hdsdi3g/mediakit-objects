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

public enum MetadataKind {

	/**
	 * Metadata is an extraction from original asset: if lost, it can be re-generated from original asset.
	 */
	COMPUTED_FROM_ASSET,
	/**
	 * Metadata is an original content: if lost, it can't be re-generated.
	 */
	MANUALLY_SET_BY_HUMAN,
	/**
	 * Metadata is an only set for test purpose. No gravity is losted.
	 */
	TEST_PURPOSE;

}
