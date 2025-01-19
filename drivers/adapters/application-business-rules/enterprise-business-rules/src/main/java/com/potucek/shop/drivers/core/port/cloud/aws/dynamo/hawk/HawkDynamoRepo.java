package com.potucek.shop.drivers.core.port.cloud.aws.dynamo.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.HawkRepo;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.Set;

public class HawkDynamoRepo implements HawkRepo {

    @SneakyThrows
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return Collections.emptySet();
    }
}
