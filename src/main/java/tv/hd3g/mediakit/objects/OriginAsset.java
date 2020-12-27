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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class OriginAsset extends AbstractBaseAssets {
	private UUID reference;
	private Map<String, String> externalReferences;
	/**
	 * A label for designate the media.
	 */
	private String name;
	private OriginAssetKind kind;

	public static OriginAsset create(final String name, final URI assertLocation, final OriginAssetKind kind) {
		final var oa = new OriginAsset();
		oa.reference = UUID.randomUUID();
		oa.name = name;
		oa.assetLocation = assertLocation;
		oa.kind = kind;
		return oa;
	}

	public UUID getReference() {
		return reference;
	}

	public void setReference(final UUID reference) {
		this.reference = reference;
	}

	public Map<String, String> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(final Map<String, String> externalReferences) {
		this.externalReferences = externalReferences;
	}

	/**
	 * A label for designate the media.
	 */
	public String getName() {
		return name;
	}

	/**
	 * A label for designate the media.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	public OriginAssetKind getKind() {
		return kind;
	}

	public void setKind(final OriginAssetKind kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		final var r = Optional.ofNullable(reference).map(UUID::toString).orElse("<?>");
		if (name != null) {
			return r + "[" + name + "]";
		}
		return r;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
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
		final var other = (OriginAsset) obj;
		return Objects.equals(reference, other.reference);
	}

}
