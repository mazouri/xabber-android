/**
 * Copyright (c) 2013, Redsolution LTD. All rights reserved.
 *
 * This file is part of Xabber project; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License, Version 3.
 *
 * Xabber is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * along with this program. If not, see http://www.gnu.org/licenses/.
 */
package com.xabber.xmpp;

import org.jivesoftware.smack.provider.PacketExtensionProvider;
import org.xmlpull.v1.XmlPullParser;

/**
 * Provides common interface to parse extensions.
 *
 * @param <Extension>
 * @author alexander.ivanov
 */
public abstract class AbstractExtensionProvider<Extension extends PacketExtension>
        extends AbstractProvider<Extension> implements PacketExtensionProvider {

    @Override
    public Extension parseExtension(XmlPullParser parser) throws Exception {
        return provideInstance(parser);
    }

}
