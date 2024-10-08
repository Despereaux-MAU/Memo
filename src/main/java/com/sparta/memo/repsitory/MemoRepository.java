package com.sparta.memo.repsitory;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo,Long> { // memoRepository
    List<Memo> findAllByOrderByModifiedAtDesc();
}