package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.SdwnController;

import java.util.List;

public interface SdwnControllerCustomRepo
{
    SdwnController findByNetwork(Long networkId, Long id);

    List<SdwnController> findByNetwork(Long networkId);
}
