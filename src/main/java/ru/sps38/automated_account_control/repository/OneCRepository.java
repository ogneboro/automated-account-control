package ru.sps38.automated_account_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sps38.automated_account_control.model.OneC;

@Repository
public interface OneCRepository extends JpaRepository<OneC, Integer> {
}
