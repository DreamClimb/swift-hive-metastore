/*
 * Copyright (C) 2013 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.hive.metastore.client.testing;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public final class NetUtils
{
    private NetUtils()
    {
    }

    public static int findUnusedPort()
        throws IOException
    {
        int port;

        ServerSocket socket = new ServerSocket();
        try {
            socket.bind(new InetSocketAddress(0));
            port = socket.getLocalPort();
        }
        finally {
            socket.close();
        }

        return port;
    }
}

