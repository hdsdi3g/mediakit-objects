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

public class ComputedRenderedAsset {// TODO test + comments

	private String type;
	private String hash;
	/**
	 * Engine name, vendor, version who provide the rendered file.
	 * Beware: web user could see/get this information.
	 */
	private String engineProducerName;
	private String mime;
	private long date;
	private long size;
	private Map<String, Object> options;

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(final String hash) {
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

	public String getMime() {
		return mime;
	}

	public void setMime(final String mime) {
		this.mime = mime;
	}

	public long getDate() {
		return date;
	}

	public void setDate(final long date) {
		this.date = date;
	}

	public long getSize() {
		return size;
	}

	public void setSize(final long size) {
		this.size = size;
	}

	public Map<String, Object> getOptions() {
		return options;
	}

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
