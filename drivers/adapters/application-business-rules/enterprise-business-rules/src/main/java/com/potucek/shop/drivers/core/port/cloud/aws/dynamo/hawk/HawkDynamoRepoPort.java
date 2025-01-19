package com.potucek.shop.drivers.core.port.cloud.aws.dynamo.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.Set;

public class HawkDynamoRepoPort implements HawkRepoPort {

    @SneakyThrows
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return Collections.emptySet();
    }
}
