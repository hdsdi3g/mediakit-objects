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

public class MetadataGlossaryEntry extends MTDEntryExtension {// TODO test + comment

	private String description;

	private List<MetadataGlossaryEntryRevision> revisions;

	public List<MetadataGlossaryEntryRevision> getRevisions() {
		return revisions;
	}

	public void setRevisions(final List<MetadataGlossaryEntryRevision> revisions) {
		this.revisions = revisions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
