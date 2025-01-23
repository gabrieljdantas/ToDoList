package treino.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import treino.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
