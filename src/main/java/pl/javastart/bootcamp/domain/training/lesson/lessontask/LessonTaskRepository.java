package pl.javastart.bootcamp.domain.training.lesson.lessontask;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LessonTaskRepository extends JpaRepository<LessonTask, Long> {
    List<LessonTask> findAllByLessonId(Long id);
}
