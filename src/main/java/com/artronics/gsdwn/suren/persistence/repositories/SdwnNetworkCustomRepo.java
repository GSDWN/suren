package com.artronics.gsdwn.suren.persistence.repositories;

import com.artronics.gsdwn.core.entities.SdwnController;
import com.artronics.gsdwn.core.entities.SdwnNetwork;

public interface SdwnNetworkCustomRepo
{
    SdwnNetwork findByIp(String ip);

    SdwnController addSdwnController(Long netId, SdwnController controller);
}
