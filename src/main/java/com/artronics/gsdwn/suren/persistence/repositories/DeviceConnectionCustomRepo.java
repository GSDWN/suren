package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.suren.entities.DeviceConnection;

public interface DeviceConnectionCustomRepo
{
    DeviceConnection findByPath(Long networkId, Long controllerId, Long id);
}
