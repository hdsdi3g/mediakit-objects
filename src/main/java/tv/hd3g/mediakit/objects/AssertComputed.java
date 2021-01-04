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

public class AssertComputed {

	/**
	 * Map of compute engine name -&gt; compute result for this asset
	 */
	private Map<String, AssertComputeEngine> computeResults;

	/**
	 * Map of compute engine name -&gt; compute result for this asset
	 */
	public Map<String, AssertComputeEngine> getComputeResults() {
		return computeResults;
	}

	/**
	 * Map of compute engine name -&gt; compute result for this asset
	 */
	public void setComputeResults(final Map<String, AssertComputeEngine> computeResults) {
		this.computeResults = computeResults;
	}
}
