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

public enum PreviewType {

	/**
	 * Displayed as simple icon in a full table page
	 */
	ICON_THUMBNAIL,
	/**
	 * Displayed as selected in an items list page
	 */
	CARTRIDGE_THUMBNAIL,
	/**
	 * Displayed in full screen/page.
	 * Can be used as an album artwork (audio player) or a video thumbnail (video player).
	 */
	FULL_SIZE_THUMBNAIL,
	/**
	 * Displayed as an audio player
	 */
	AUDIO,
	/**
	 * Displayed as a video player, low res/low bitrate
	 */
	VIDEO_LQ,
	/**
	 * Displayed as a video player, mid res/mid bitrate (SD)
	 */
	VIDEO_SD,
	/**
	 * Displayed as a video player, full HD res/HD preview class bitrate
	 */
	VIDEO_HD,
	/**
	 * Displayed as a book reader (with page selection...)
	 */
	BOOK,
	/**
	 * Page in a book
	 */
	BOOK_PAGE;

	// TODO add subtitle ?
	// TODO add keyframes images ?
	// TODO add chapters ?
	// TODO add markers ?
}
