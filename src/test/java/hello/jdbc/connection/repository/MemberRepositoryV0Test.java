package hello.jdbc.connection.repository;

import hello.jdbc.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException{

        Member member = new Member("memberV0",10000);
        repository.save(member);

        Member findMember = repository.findById(member.getMemberId());

        assertThat(findMember).isEqualTo(member);


        repository.update(member.getMemberId(),20000);
        Member updateMember = repository.findById(member.getMemberId());

        assertThat(updateMember.getMoney()).isEqualTo(20000);
    }


}