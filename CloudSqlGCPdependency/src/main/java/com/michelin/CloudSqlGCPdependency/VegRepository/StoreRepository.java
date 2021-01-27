package com.michelin.CloudSqlGCPdependency.VegRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michelin.CloudSqlGCPdependency.Entity.Stores;

@Repository
public interface StoreRepository extends JpaRepository<Stores, Integer> {

}
