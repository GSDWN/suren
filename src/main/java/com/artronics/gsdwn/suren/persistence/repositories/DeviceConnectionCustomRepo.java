package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.DeviceConnection;

public interface DeviceConnectionCustomRepo
{
    DeviceConnection findByPath(Long networkId, Long controllerId, Long id);
}
