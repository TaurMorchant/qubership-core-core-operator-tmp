package org.qubership.core.declarative.client.reconciler;

import io.fabric8.kubernetes.client.KubernetesClient;
import org.qubership.core.declarative.client.rest.DeclarativeClient;
import org.qubership.core.declarative.resources.dbaas.Dbaas;

public abstract class BaseDbaasReconciler<T extends Dbaas> extends PoolingReconciler<T> {

    public BaseDbaasReconciler(KubernetesClient client, DeclarativeClient dbaasDeclarativeClient) {
        super(client, dbaasDeclarativeClient);
    }

    protected BaseDbaasReconciler() {
    }
}
