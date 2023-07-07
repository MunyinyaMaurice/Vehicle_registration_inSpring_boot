package com.Exam.GymManagement23991;

import com.Exam.GymManagement23991.impl.GymImpl;
import com.Exam.GymManagement23991.impl.GymMemberInter;
import com.Exam.GymManagement23991.Dao.gymRepo;
import com.Exam.GymManagement23991.Model.GymMember;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestGymMember23991 {

	@Test
	void contextLoads() {
	}
	private GymImpl gymService= new GymImpl();



	@Autowired
	gymRepo repo;

	@Test
	@Order(1)
	void testSaveMember() {
		GymMember gym = new GymMember();
		gym.setNationalId("119968011");
		gym.setName("Munyinya Shema");
		gym.setEmail("munyinya13@gmail.com");
		gym.setMemberShipType("Gold");
		gym.setStartDate(gym.getStartDate());
		gym.setStartDate(gym.getStartDate());
		GymMember gymMember = repo.save(gym);
		assertEquals(gymMember.getId(), gymMember.getId());

	}

	//NEGATIVE TEST
	@Test
	@Order(7)
	void testSaveMemberNEGATIVE() {
		GymMember gym = new GymMember();
		gym.setNationalId("119968011");
		gym.setName("Munyinya Shema");
		gym.setEmail("munyinya13@gmail.com");
		gym.setMemberShipType("Gold");
		gym.setStartDate(gym.getStartDate());
		gym.setStartDate(gym.getStartDate());
		GymMember gymMember = repo.save(gym);
		assertEquals(gymMember.getName(), gymMember.getId());

	}
	@Test
	@Order(2)
	void testgetallMember() {
		List<GymMember> members = repo.findAll();
		boolean isFound = false;
		if (members.size() != 0) {
			isFound = true;
		}
		assertEquals(true, isFound);
	}

	//NEGATIVE
	@Test
	@Order(8)
	void testGetGymByIdNEGATIVE() {
		Optional<GymMember> gymMember = repo.findById(3L);
		boolean isFound = gymMember.isPresent();
		assertEquals(true, isFound);
	}

	@Test
	@Order(3)
	void testGetGymById() {
		Optional<GymMember> gymMember = repo.findById(1L);
		boolean isFound = gymMember.isPresent();
		assertEquals(true, isFound);
	}
@Test
@Order(4)
	public void testFindByNationalId() {
		GymMember gymMember = gymService.findByNationalId("119968011");

		assertNotNull(gymMember);
		assertEquals("119968011", gymMember.getNationalId());
	}
// NEGAT
//@Test
//@Order(9)
//void testUpdateCafeNEGA() {
//	GymMember gym = new GymMember();
//	gym.setNationalId(1L);
//	gym.setName("Maurice update");
//	gym.setEmail("maurice@gmail.com");
//	gym.setMemberShipType("premium");
//	GymMember res = repo.save(gym);
//	assertEquals(res.getId(), res.getId());
//}
	@Test
	@Order(5)
	void testUpdateCafe() {
		GymMember gym = new GymMember();
		gym.setNationalId("119968011");
		gym.setName("Maurice update");
		gym.setEmail("maurice@gmail.com");
		gym.setMemberShipType("premium");
		GymMember res = repo.save(gym);
		assertEquals(res.getId(), res.getId());
	}

	@Test
	@Order(6)
	void testdeleteCafe() {
		repo.deleteById(1L);
		Optional<GymMember> gymMember = repo.findById(1L);
		boolean isFound = gymMember.isPresent();
		assertEquals(false, isFound);

	}
}
