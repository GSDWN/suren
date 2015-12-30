package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.DeviceConnection;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeviceConnectionRepo extends PagingAndSortingRepository<DeviceConnection,Long>,
                                              DeviceConnectionCustomRepo
{
}
