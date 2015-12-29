package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.suren.entities.SdwnNode;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SdwnNodeRepo extends PagingAndSortingRepository<SdwnNode,Long>
{
}
