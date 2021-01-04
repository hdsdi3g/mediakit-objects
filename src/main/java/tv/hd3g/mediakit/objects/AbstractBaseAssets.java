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

import java.net.URI;
import java.util.Objects;
import java.util.Optional;

abstract class AbstractBaseAssets {

	/**
	 * The location for the master asset file.
	 */
	protected URI assetLocation;

	/**
	 * The location for the master asset file.
	 */
	public URI getAssetLocation() {
		return assetLocation;
	}

	/**
	 * The location for the master asset file.
	 */
	public void setAssetLocation(final URI assetLocation) {
		this.assetLocation = assetLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetLocation);
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final var other = (AbstractBaseAssets) obj;
		return Objects.equals(assetLocation, other.assetLocation);
	}

	@Override
	public String toString() {
		return Optional.ofNullable(assetLocation).map(URI::toString).orElse("null");
	}
}
