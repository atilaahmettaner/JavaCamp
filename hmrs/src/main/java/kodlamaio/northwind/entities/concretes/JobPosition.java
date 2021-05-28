package kodlamaio.northwind.entities.concretes;



import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@Entity
@Table(name = "job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor
	
public class JobPosition {
		

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

	
	}
