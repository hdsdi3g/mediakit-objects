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

import java.util.Map;

/**
 * Describe all used metadata entry norms and tags
 */
public class MetadataGlossary { // TODO test + comment

	private MetadataEntryNormKind normKind;

	/**
	 * norm name &gt; glossary entry
	 */
	private Map<String, MetadataGlossaryEntry> glossary;

	public MetadataEntryNormKind getNormKind() {
		return normKind;
	}

	public void setNormKind(final MetadataEntryNormKind normKind) {
		this.normKind = normKind;
	}

	public Map<String, MetadataGlossaryEntry> getGlossary() {
		return glossary;
	}

	public void setGlossary(final Map<String, MetadataGlossaryEntry> glossary) {
		this.glossary = glossary;
	}

}
