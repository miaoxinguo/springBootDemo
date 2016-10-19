package io.github.miaoxinguo.sbs.service;

import io.github.miaoxinguo.sbs.entity.Account;
import io.github.miaoxinguo.sbs.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public Integer add(Account account) {
        return accountRepository.insert(account);
    }

    @Transactional
    public Account getById(Integer id) {
        return accountRepository.selectById(id);
    }
}