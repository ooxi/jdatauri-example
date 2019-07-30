/**
 * Copyright (c) 2019 ooxi
 *     https://github.com/ooxi/jdatauri-example
 *
 * This software is provided 'as-is', without any express or implied warranty.
 * In no event will the authors be held liable for any damages arising from the
 * use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 *
 *  1. The origin of this software must not be misrepresented; you must not
 *     claim that you wrote the original software. If you use this software in a
 *     product, an acknowledgment in the product documentation would be
 *     appreciated but is not required.
 *
 *  2. Altered source versions must be plainly marked as such, and must not be
 *     misrepresented as being the original software.
 *
 *  3. This notice may not be removed or altered from any source distribution.
 */
package com.github.ooxi.jdatauri.example;

import com.github.ooxi.jdatauri.DataUri;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author ooxi
 */
public final class Main {

	public static void main(String[] args) {
		final DataUri uri = DataUri.parse("data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==", UTF_8);
		System.out.println("Mime Type is: " + uri.getMime());
		System.out.println("Image size is " + uri.getData().length + " bytes");
	}



	private Main() {
	}
}
