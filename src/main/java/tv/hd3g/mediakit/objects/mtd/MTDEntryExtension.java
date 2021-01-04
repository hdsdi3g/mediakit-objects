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

import java.util.Locale;

public abstract class MTDEntryExtension { // TODO test + comment
	/**
	 * The metadata relevant locale.
	 */
	protected Locale locale;
	/**
	 * Where the metadata was created.
	 */
	protected MetadataKind kind;

	protected long created;
	protected String createdBy;
	protected long updated;
	protected String updatedBy;
	protected String sourceProducerName;

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(final Locale locale) {
		this.locale = locale;
	}

	public MetadataKind getKind() {
		return kind;
	}

	public void setKind(final MetadataKind kind) {
		this.kind = kind;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(final long created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	public long getUpdated() {
		return updated;
	}

	public void setUpdated(final long updated) {
		this.updated = updated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(final String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getSourceProducerName() {
		return sourceProducerName;
	}

	public void setSourceProducerName(final String sourceProducerName) {
		this.sourceProducerName = sourceProducerName;
	}

}
