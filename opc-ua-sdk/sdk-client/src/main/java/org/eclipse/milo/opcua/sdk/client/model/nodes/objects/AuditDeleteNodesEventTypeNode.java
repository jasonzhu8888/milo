/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.client.model.nodes.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.client.model.types.objects.AuditDeleteNodesEventType;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.structured.DeleteNodesItem;

public class AuditDeleteNodesEventTypeNode extends AuditNodeManagementEventTypeNode implements AuditDeleteNodesEventType {
    public AuditDeleteNodesEventTypeNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<PropertyTypeNode> getNodesToDeleteNode() {
        return getPropertyNode(AuditDeleteNodesEventType.NODES_TO_DELETE);
    }

    public CompletableFuture<DeleteNodesItem[]> getNodesToDelete() {
        return getProperty(AuditDeleteNodesEventType.NODES_TO_DELETE);
    }

    public CompletableFuture<StatusCode> setNodesToDelete(DeleteNodesItem[] value) {
        return setProperty(AuditDeleteNodesEventType.NODES_TO_DELETE, value);
    }
}
