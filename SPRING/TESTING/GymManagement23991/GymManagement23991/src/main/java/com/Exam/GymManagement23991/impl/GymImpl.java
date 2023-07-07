package com.Exam.GymManagement23991.impl;

import com.Exam.GymManagement23991.Dao.gymRepo;
import com.Exam.GymManagement23991.Model.GymMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymImpl implements GymMemberInter{
    @Autowired
    gymRepo repo;

    @Override
    public GymMember findByNationalId(String nationalId) {
        GymMember member = repo.findByNationalId(nationalId);
        return member;
    }
}

