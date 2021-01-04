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

import java.util.Objects;
import java.util.Set;

public class IndexedMetadatas {// TODO test + comment

	private Set<MetadataEntry> entries;
	private Set<MetadataTag> tags;
	private String rawTextPlain;

	public Set<MetadataEntry> getEntries() {
		return entries;
	}

	public void setEntries(final Set<MetadataEntry> entries) {
		this.entries = entries;
	}

	public Set<MetadataTag> getTags() {
		return tags;
	}

	public void setTags(final Set<MetadataTag> tags) {
		this.tags = tags;
	}

	public String getRawTextPlain() {
		return rawTextPlain;
	}

	public void setRawTextPlain(final String rawTextPlain) {
		this.rawTextPlain = rawTextPlain;
	}

	@Override
	public int hashCode() {
		return Objects.hash(entries, rawTextPlain, tags);
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
		final var other = (IndexedMetadatas) obj;
		return Objects.equals(entries, other.entries) && Objects.equals(rawTextPlain, other.rawTextPlain) && Objects
		        .equals(tags, other.tags);
	}

}
