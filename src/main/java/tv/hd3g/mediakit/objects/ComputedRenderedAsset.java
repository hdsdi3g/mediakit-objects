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

/**
 * A compute result part as a simple file for an asset
 */
public class ComputedRenderedAsset {

	/**
	 * Type of file (not the mime), like "preview" for to distinguish the other rendered files for this asset.
	 */
	private String type;
	/**
	 * All the digest values for this file: hash type (like MD5) &gt; hash value (like FD45CA19...)
	 */
	private Map<String, String> hash;
	/**
	 * Engine name, vendor, version who provide the rendered file.
	 * Beware: web user could see/get this information.
	 */
	private String engineProducerName;
	/**
	 * Mime code for file, like "application/octet-stream"
	 */
	private String mime;
	/**
	 * Created date for file
	 */
	private long date;
	/**
	 * File size
	 */
	private long size;
	/**
	 * Optional informations for operate the file, like duration, resolution...
	 */
	private Map<String, Object> options;

	/**
	 * Type of file (not the mime), like "preview" for to distinguish the other rendered files for this asset.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Type of file (not the mime), like "preview" for to distinguish the other rendered files for this asset.
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * All the digest values for this file: hash type (like MD5) &gt; hash value (like FD45CA19...)
	 */
	public Map<String, String> getHash() {
		return hash;
	}

	/**
	 * All the digest values for this file: hash type (like MD5) &gt; hash value (like FD45CA19...)
	 */
	public void setHash(final Map<String, String> hash) {
		this.hash = hash;
	}

	/**
	 * Engine name, vendor, version who provide the rendered file.
	 */
	public String getEngineProducerName() {
		return engineProducerName;
	}

	/**
	 * Engine name, vendor, version who provide the rendered file.
	 * Beware: web user could see/get this information.
	 */
	public void setEngineProducerName(final String engineProducerName) {
		this.engineProducerName = engineProducerName;
	}

	/**
	 * Mime code for file, like "application/octet-stream"
	 */
	public String getMime() {
		return mime;
	}

	/**
	 * Mime code for file, like "application/octet-stream"
	 */
	public void setMime(final String mime) {
		this.mime = mime;
	}

	/**
	 * Created date for file
	 */
	public long getDate() {
		return date;
	}

	/**
	 * Created date for file
	 */
	public void setDate(final long date) {
		this.date = date;
	}

	/**
	 * File size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * File size
	 */
	public void setSize(final long size) {
		this.size = size;
	}

	/**
	 * Optional informations for operate the file, like duration, resolution...
	 */
	public Map<String, Object> getOptions() {
		return options;
	}

	/**
	 * Optional informations for operate the file, like duration, resolution...
	 */
	public void setOptions(final Map<String, Object> options) {
		this.options = options;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, engineProducerName, hash, mime, options, size, type);
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
		final var other = (ComputedRenderedAsset) obj;
		return date == other.date && Objects.equals(engineProducerName, other.engineProducerName) && Objects.equals(
		        hash, other.hash) && Objects.equals(mime, other.mime) && Objects.equals(options, other.options)
		       && size == other.size && Objects.equals(type, other.type);
	}

}
