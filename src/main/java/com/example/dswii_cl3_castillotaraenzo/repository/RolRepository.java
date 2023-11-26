package com.example.dswii_cl3_castillotaraenzo.repository;
import com.example.dswii_cl3_castillotaraenzo.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}