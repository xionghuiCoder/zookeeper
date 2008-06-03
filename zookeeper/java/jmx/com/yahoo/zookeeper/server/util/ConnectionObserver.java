/**
 * Copyright 2008, Yahoo! Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.zookeeper.server.util;

import com.yahoo.zookeeper.server.ServerCnxn;

/**
 * Application must implement this interface and register its instance with
 * the {@link ObserverManager}.
 */
public interface ConnectionObserver {
    /**
     * A new client connection started
     * @param sc the new connection instance
     */
    public void onNew(ServerCnxn sc);
    /**
     * A client connected closed
     * @param sc the connection instance
     */
    public void onClose(ServerCnxn sc);
}
