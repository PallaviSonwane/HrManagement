    package inc.hrmanagement.entity;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Table(name="app_user")
    @Setter
    @Getter
    public class User {

        @Id
        @GeneratedValue
        private Long id;
        private String username;
        private String password;

        
    }

