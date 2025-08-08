package com.netcracker.core.declarative.client.rest.deprecated;

import org.qubership.core.declarative.client.rest.ProcessStatus;
import lombok.Getter;

@Getter
public class SyncResponse {
    ProcessStatus status;
    String message;
    Object operationDetails;
}
