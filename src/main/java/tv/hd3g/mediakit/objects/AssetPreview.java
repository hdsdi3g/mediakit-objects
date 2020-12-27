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

import java.util.Map;
import java.util.Objects;

public class AssetPreview extends AbstractBaseAssets implements Comparable<AssetPreview> {

	/**
	 * How this preview should be used for display
	 */
	private PreviewType type;
	/**
	 * Some informations for display it
	 */
	private Map<String, Object> options;
	/**
	 * Relative position with others AssetPreview for this asset.
	 * Can be a page book index, an audio track, a video version...
	 */
	private int index;

	/**
	 * How this preview should be used for display
	 */
	public void setType(final PreviewType type) {
		this.type = type;
	}

	/**
	 * How this preview should be used for display
	 */
	public PreviewType getType() {
		return type;
	}

	/**
	 * Some informations for display it
	 */
	public void setOptions(final Map<String, Object> options) {
		this.options = options;
	}

	/**
	 * Some informations for display it
	 */
	public Map<String, Object> getOptions() {
		return options;
	}

	/**
	 * Relative position with others AssetPreview for this asset.
	 * Can be a page book index, an audio track, a video version...
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Relative position with others AssetPreview for this asset.
	 * Can be a page book index, an audio track, a video version...
	 */
	public void setIndex(final int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return type + "#" + index + "[" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final var prime = 31;
		var result = super.hashCode();
		result = prime * result + Objects.hash(index, options, type);
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final var other = (AssetPreview) obj;
		return index == other.index && Objects.equals(options, other.options) && type == other.type;
	}

	@Override
	public int compareTo(final AssetPreview compared) {
		if (compared == null) {
			return 0;
		}
		if (compared.type == null || compared.type == type) {
			return Integer.compare(index, compared.index);
		}
		return Integer.compare(type.ordinal(), compared.type.ordinal());
	}

}
