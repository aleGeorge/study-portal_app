package com.bunkless.studyportal.service;

import com.bunkless.studyportal.entity.Video;
import com.bunkless.studyportal.repository.videoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class videoService {
    private final videoRepository videorepository;

    public videoService(videoRepository videorepository){
        this.videorepository = videorepository;
    }

    public Video addVideo(Video video){
        return videorepository.save(video);
    }
    public List<Video> getAllVideo(){
        return videorepository.findAll();
    }
    public Video getVideoById(Long id){
        return videorepository.findById(id)
                .orElseThrow(()->new RuntimeException("Video not found with id"+id));
    }
    public Video updateVideo(Long id,Video video){
        Video existingVideo = videorepository.findById(id)
                .orElseThrow(()->new RuntimeException("Video not found with id" + id));

        existingVideo.setTitle(video.getTitle());
        existingVideo.setVideoUrl(video.getVideoUrl());
        existingVideo.setDescription(video.getDescription());
        existingVideo.setCourse(video.getCourse());

        return videorepository.save(existingVideo);
    }
    public void deleteVideoById(Long id){
        videorepository.deleteById(id);
    }
}
