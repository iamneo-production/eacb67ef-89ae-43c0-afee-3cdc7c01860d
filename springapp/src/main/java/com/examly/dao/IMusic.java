package com.examly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.model.Music;
public interface IMusic extends JpaRepository<Music, Integer>{
    
}
