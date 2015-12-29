package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.suren.entities.PacketModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PacketRepo extends PagingAndSortingRepository<PacketModel,Long>
{
}
