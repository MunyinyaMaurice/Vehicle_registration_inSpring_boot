package com.Exam.GymManagement23991;

import com.Exam.GymManagement23991.Model.GymMember;
import com.Exam.GymManagement23991.Dao.gymRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymManagement23991Application implements CommandLineRunner {
@Autowired
	gymRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(GymManagement23991Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		GymMember gym = new GymMember();
		gym.setNationalId("119968011");
		gym.setName("Munyinya Shema");
		gym.setEmail("munyinya13@gmail.com");
		gym.setMemberShipType("Gold");
		gym.setStartDate("05/5/2023");
		gym.setEndDate("06/5/2023");
		 repo.save(gym);

	}
}
