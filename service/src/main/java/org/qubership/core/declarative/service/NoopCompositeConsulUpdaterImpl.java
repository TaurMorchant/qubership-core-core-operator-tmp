package org.qubership.core.declarative.service;

import org.qubership.core.declarative.exception.NoopConsulException;

import java.util.Set;

public class NoopCompositeConsulUpdaterImpl implements CompositeConsulUpdater {

    @Override
    public void updateCompositeStructureInConsul(CompositeSpec compositeSpec) {
        throw new NoopConsulException();
    }

    @Override
    public Set<String> getCompositeMembers(String compositeId) {
        throw new NoopConsulException();
    }
}
