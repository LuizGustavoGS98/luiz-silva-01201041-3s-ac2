package br.com.bandtec.luiz.projetoac2.Repository;

import br.com.bandtec.luiz.projetoac2.Domain.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Integer> {

    @Query("SELECT count(f) from Fighter f where f.vida > 0")
    Integer countAllByVida();

    @Query("SELECT f from Fighter f where f.vida = 0")
    List<Fighter> findByVida();
}
