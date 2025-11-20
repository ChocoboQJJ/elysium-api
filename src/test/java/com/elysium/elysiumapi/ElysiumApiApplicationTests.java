package com.elysium.elysiumapi;

import com.elysium.elysiumapi.entity.Account;
import com.elysium.elysiumapi.mapper.AccountMapper;
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.elysium.elysiumapi.entity.table.AccountTableDef.ACCOUNT;

@SpringBootTest
class ElysiumApiApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where(ACCOUNT.ID.eq(1));
        Account account = accountMapper.selectOneByQuery(queryWrapper);
        System.out.println(account);
    }

}
