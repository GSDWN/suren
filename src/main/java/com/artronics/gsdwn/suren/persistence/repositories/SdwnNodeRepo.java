package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.SdwnNode;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SdwnNodeRepo extends PagingAndSortingRepository<SdwnNode,Long>
{
}
