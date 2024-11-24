package todoapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import todoapp.config.Database;
import todoapp.repositories.TodoListRepository;
import todoapp.repositories.TodoListRepositoryDbImpl;
import todoapp.services.TodoListService;
import todoapp.services.TodoListServiceImpl;
import todoapp.views.TodoListTerminalViewImpl;
import todoapp.views.TodoListView;

@Component(basePackages = "todoapp")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TodoListView todoListView = context.getBean(TodoListView.class);
    }
    @Bean
    Database database(){
        Database database = new Database("todo_si", "root", "", "localhost", "3306");
        database.setup();
        return database;
    }
}
