package com.Exam.GymManagement23991.Dao;

import com.Exam.GymManagement23991.Model.GymMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gymRepo extends JpaRepository<GymMember,Long> {
public GymMember findByEmail(String email);
    public GymMember findByNationalId(String nationalId);
}
