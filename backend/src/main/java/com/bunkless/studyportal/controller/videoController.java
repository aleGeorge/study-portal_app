package com.bunkless.studyportal.controller;

import com.bunkless.studyportal.entity.Video;
import com.bunkless.studyportal.service.videoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class videoController {

    private final videoService videoservice;

    public videoController(videoService videoservice){
        this.videoservice = videoservice;
    }

    @PostMapping
    public ResponseEntity<Video> addVideo(@RequestBody Video video){
        return ResponseEntity.ok(videoservice.addVideo(video));
    }
    @GetMapping
    public ResponseEntity<List<Video>> getAllVideo(){
        return ResponseEntity.ok(videoservice.getAllVideo());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long id){
        return ResponseEntity.ok(videoservice.getVideoById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id,@RequestBody Video video){
        return ResponseEntity.ok(videoservice.updateVideo(id, video));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideoById(@PathVariable Long id){
        videoservice.deleteVideoById(id);
        return ResponseEntity.noContent().build();
    }
}
