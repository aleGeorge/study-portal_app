package com.bunkless.studyportal.repository;

import com.bunkless.studyportal.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface videoRepository extends JpaRepository<Video,Long> {

}
