package pe.edu.upc.spring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import pe.edu.upc.spring.model.Users;


@Repository
public interface IUserRepository extends JpaRepository<Users, Integer>{
	
	@Query("from Users u where u.email = :email and u.password = :password ")
	List<Users> findByEmailAndPassword(@Param("email")String email, @Param("password")String password);
	
}
