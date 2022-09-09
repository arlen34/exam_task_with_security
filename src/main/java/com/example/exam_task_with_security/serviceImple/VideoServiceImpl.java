package com.example.exam_task_with_security.serviceImple;

import com.example.exam_task_with_security.model.Video;
import com.example.exam_task_with_security.repositoryImpl.repository.VideoRepository;
import com.example.exam_task_with_security.serviceImple.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VideoServiceImpl implements VideoService {
    private final VideoRepository repository;

    @Autowired
    public VideoServiceImpl(VideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveVideo(int lessId, Video video) {
        repository.saveVideo(lessId, video);
    }

    @Override
    public void updateVideo(int id, Video video) {
        repository.updateVideo(id, video);
    }

    @Override
    public Video getVideoById(int id) {
        return repository.getVideoById(id);
    }

    @Override
    public List<Video> getAllVideos(int id) {
        return repository.getAllVideos(id);
    }

    @Override
    public void deleteVideoById(int id) {
        repository.deleteVideoById(id);
    }
}
