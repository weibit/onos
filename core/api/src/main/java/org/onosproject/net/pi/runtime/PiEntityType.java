/*
 * Copyright 2017-present Open Networking Foundation
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

package org.onosproject.net.pi.runtime;

import com.google.common.annotations.Beta;

/**
 * Type of runtime entity of a protocol-independent pipeline.
 */
@Beta
public enum PiEntityType {
    /**
     * Table entry.
     */
    TABLE_ENTRY,

    /**
     * Action profile group.
     */
    GROUP,

    /**
     * Action profile group member.
     */
    GROUP_MEMBER,

    /**
     * Meter config.
     */
    METER_CELL_CONFIG,

    /**
     * Register entry.
     */
    REGISTER_CELL,

    /**
     * Packet Replication Engine (PRE) multicast group entry.
     */
    PRE_MULTICAST_GROUP_ENTRY,

    /**
     * Packet Replication Engine (PRE) clone session entry.
     */
    PRE_CLONE_SESSION_ENTRY
}
