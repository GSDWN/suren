package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.SdwnController;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SdwnControllerRepo extends PagingAndSortingRepository<SdwnController,Long>, SdwnControllerCustomRepo
{
}
