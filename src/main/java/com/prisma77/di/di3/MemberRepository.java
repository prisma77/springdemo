package com.prisma77.di.di3;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}