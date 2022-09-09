package com.example.exam_task_with_security.repositoryImpl;

import com.example.exam_task_with_security.model.Lesson;
import com.example.exam_task_with_security.model.Video;
import com.example.exam_task_with_security.repositoryImpl.repository.VideoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class VideoRepositoryImpl implements VideoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public void saveVideo(int lessId, Video video) {
        Lesson lesson = manager.find(Lesson.class, lessId);
        lesson.setVideo(video);
        video.setLesson(lesson);
        manager.persist(video);
    }

    @Override
    public void updateVideo(int id, Video video) {
        Video video1 = manager.find(Video.class, id);
        video1.setVideoName(video.getVideoName());
        video1.setLink(video.getLink());
        manager.merge(video1);
    }

    @Override
    public Video getVideoById(int id) {
        return manager.find(Video.class, id);

    }

    @Override
    public List<Video> getAllVideos(int id) {
        return manager
                .createQuery("SELECT video FROM Video video where video.lesson.id = : id",
                        Video.class)
                .setParameter("id", id).getResultList();
    }

    @Override
    public void deleteVideoById(int id) {
        Video video = manager.find(Video.class, id);
        video.setLesson(null);
        manager.remove(video);
    }
}
