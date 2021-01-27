package com.michelin.CloudSqlGCPdependency.VegRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michelin.CloudSqlGCPdependency.Entity.Vegetables;

@Repository
public interface VegRepository extends JpaRepository<Vegetables, Integer> {

}
