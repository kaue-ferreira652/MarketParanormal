package com.dest1.MarketParanormal.repositories;

import com.dest1.MarketParanormal.Entities.MarketParanormal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MpRepository extends JpaRepository<MarketParanormal, Integer>{
}
