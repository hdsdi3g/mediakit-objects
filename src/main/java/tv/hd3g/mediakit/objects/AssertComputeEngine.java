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

public class AssertComputeEngine {// TODO test + comments

	private Map<String, Object> datas;
	/**
	 * Can be sended to web clients without risks (functionnals, security or personnal informations leaks) ?
	 */
	private boolean sensibleDatas;

	private List<ComputedRenderedAsset> renderedList;

	public Map<String, Object> getDatas() {
		return datas;
	}

	public void setDatas(final Map<String, Object> datas) {
		this.datas = datas;
	}

	/**
	 * Can be sended to web clients without risks (functionnals, security or personnal informations leaks) ?
	 */
	public boolean isSensibleDatas() {
		return sensibleDatas;
	}

	/**
	 * Can be sended to web clients without risks (functionnals, security or personnal informations leaks) ?
	 */
	public void setSensibleDatas(final boolean sensibleDatas) {
		this.sensibleDatas = sensibleDatas;
	}

	public List<ComputedRenderedAsset> getRenderedList() {
		return renderedList;
	}

	public void setRenderedList(final List<ComputedRenderedAsset> renderedList) {
		this.renderedList = renderedList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datas, renderedList, sensibleDatas);
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
		final var other = (AssertComputeEngine) obj;
		return Objects.equals(datas, other.datas) && Objects.equals(renderedList, other.renderedList)
		       && sensibleDatas == other.sensibleDatas;
	}

}
