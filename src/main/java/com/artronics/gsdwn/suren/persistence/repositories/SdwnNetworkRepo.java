package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.SdwnNetwork;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SdwnNetworkRepo extends PagingAndSortingRepository<SdwnNetwork,Long>,SdwnNetworkCustomRepo
{
}
