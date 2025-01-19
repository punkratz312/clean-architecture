package com.potucek.shop.drivers.port.cloud.aws.s3.hawk;

import com.potucek.shop.drivers.core.application.services.hawk.port.HawkRepoPort;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.Set;

public class HawkS3RepoPort implements HawkRepoPort {

    @SneakyThrows
    @Override
    public Set<Object> findAllHawksSortedByIUCNCategory() {
        return Collections.emptySet();
    }
}
