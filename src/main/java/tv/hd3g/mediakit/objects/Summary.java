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

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Summary {// TODO test

	private String mimeCode;
	private Map<String, String> analysersAbstracts;
	private List<AssetPreview> previews;
	private AssetPreview masterAsPreview;

	public String getMimeCode() {
		return mimeCode;
	}

	public void setMimeCode(final String mimeCode) {
		this.mimeCode = mimeCode;
	}

	public Map<String, String> getAnalysersAbstracts() {
		return analysersAbstracts;
	}

	public void setAnalysersAbstracts(final Map<String, String> analysersAbstracts) {
		this.analysersAbstracts = analysersAbstracts;
	}

	public List<AssetPreview> getPreviews() {
		return previews;
	}

	public void setPreviews(final List<AssetPreview> previews) {
		this.previews = previews;
	}

	public AssetPreview getMasterAsPreview() {
		return masterAsPreview;
	}

	public void setMasterAsPreview(final AssetPreview masterAsPreview) {
		this.masterAsPreview = masterAsPreview;
	}

	@Override
	public int hashCode() {
		return Objects.hash(analysersAbstracts, masterAsPreview, mimeCode, previews);
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
		final var other = (Summary) obj;
		return Objects.equals(analysersAbstracts, other.analysersAbstracts) && Objects.equals(masterAsPreview,
		        other.masterAsPreview) && Objects.equals(mimeCode, other.mimeCode) && Objects.equals(previews,
		                other.previews);
	}

}
