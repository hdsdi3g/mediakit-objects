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

/**
 * How to display an asset to a webpage, does not matter its format/type ?
 */
public class AssetSummary {

	/**
	 * Computed original file mime code, like "application/octet-stream"
	 */
	private String mimeCode;
	/**
	 * Map of analyserName -&gt; analyserAbstactText
	 */
	private Map<String, String> analysersAbstracts;
	/**
	 * All registed previews for this asset.
	 * You should sorted this list before use.
	 */
	private List<AssetPreview> previews;
	/**
	 * Is the master file can be send to clients without risks (functionnals, security or personnal informations leaks) ?
	 */
	private AssetPreview masterAsPreview;

	/**
	 * Computed original file mime code, like "application/octet-stream"
	 */
	public String getMimeCode() {
		return mimeCode;
	}

	/**
	 * Computed original file mime code, like "application/octet-stream"
	 */
	public void setMimeCode(final String mimeCode) {
		this.mimeCode = mimeCode;
	}

	/**
	 * Map of analyserName -&gt; analyserAbstactText
	 */
	public Map<String, String> getAnalysersAbstracts() {
		return analysersAbstracts;
	}

	/**
	 * Map of analyserName -&gt; analyserAbstactText
	 */
	public void setAnalysersAbstracts(final Map<String, String> analysersAbstracts) {
		this.analysersAbstracts = analysersAbstracts;
	}

	/**
	 * All registed previews for this asset.
	 * You should sorted this list before use.
	 */
	public List<AssetPreview> getPreviews() {
		return previews;
	}

	/**
	 * All registed previews for this asset.
	 */
	public void setPreviews(final List<AssetPreview> previews) {
		this.previews = previews;
	}

	/**
	 * Is the master file can be send to clients without risks (functionnals, security or personnal informations leaks) ?
	 */
	public AssetPreview getMasterAsPreview() {
		return masterAsPreview;
	}

	/**
	 * Is the master file can be send to clients without risks (functionnals, security or personnal informations leaks) ?
	 */
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
		final var other = (AssetSummary) obj;
		return Objects.equals(analysersAbstracts, other.analysersAbstracts) && Objects.equals(masterAsPreview,
		        other.masterAsPreview) && Objects.equals(mimeCode, other.mimeCode) && Objects.equals(previews,
		                other.previews);
	}

}
