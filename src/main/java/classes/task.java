package classes;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@Data
@Entity
public class task {

    @Getter
    @Setter
    @Id
    Long id;
    String description;
    Object dueDate;
    Boolean priority;


}
