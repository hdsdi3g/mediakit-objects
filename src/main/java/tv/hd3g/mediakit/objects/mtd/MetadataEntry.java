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

import java.util.List;
import java.util.Objects;

public class MetadataEntry extends MTDEntryExtension {// TODO test + comment

	/**
	 * Like RIFF, XMP, DICOM, DUBLIN_CORE...
	 */
	private String norm;

	/**
	 * Type of this medatada norm (to avoid name conflicts)
	 */
	private MetadataEntryNormKind normKind;

	/**
	 * The full qualified name for the metadata, like "aa.bb.cc"
	 */
	private String name;

	/**
	 * The string represented value(s).
	 */
	private List<String> values;

	@Override
	public int hashCode() {
		return Objects.hash(kind, locale, name, norm, normKind, values);
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
		final var other = (MetadataEntry) obj;
		return kind == other.kind && Objects.equals(locale, other.locale) && Objects.equals(name, other.name) && Objects
		        .equals(norm, other.norm) && normKind == other.normKind && Objects.equals(values, other.values);
	}

	public String getNorm() {
		return norm;
	}

	public void setNorm(final String norm) {
		this.norm = norm;
	}

	public MetadataEntryNormKind getNormKind() {
		return normKind;
	}

	public void setNormKind(final MetadataEntryNormKind normKind) {
		this.normKind = normKind;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(final List<String> values) {
		this.values = values;
	}

}
