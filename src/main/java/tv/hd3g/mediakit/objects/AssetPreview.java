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

import java.util.Objects;

public class AssetPreview extends AbstractBaseAssets implements Comparable<AssetPreview> {

	private PreviewType type;
	private Object options;
	private int index;

	public void setOptions(final Object options) {
		this.options = options;
	}

	public Object getOptions() {
		return options;
	}

	public void setType(final PreviewType type) {
		this.type = type;
	}

	public PreviewType getType() {
		return type;
	}

	public int getIndex() {
		return index;
	}

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
	public int compareTo(final AssetPreview compared) {// TODO test
		if (compared == null) {
			return 0;
		}
		if (compared.type == null || compared.type == type) {
			return Integer.compare(index, compared.index);
		}
		return Integer.compare(type.ordinal(), compared.type.ordinal());
	}

}
