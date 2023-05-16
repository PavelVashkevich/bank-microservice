package com.github.pavelvashkevich.bankmicroservice.service;

import com.github.pavelvashkevich.bankmicroservice.model.postgres.AccountLimit;
import com.github.pavelvashkevich.bankmicroservice.model.postgres.Client;
import com.github.pavelvashkevich.bankmicroservice.model.types.enumerators.ExpenseCategory;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AccountLimitService {

    void save(AccountLimit limit);

    void update(AccountLimit limit);

    Optional<AccountLimit> findLastByExpenseCategoryAndClient(ExpenseCategory expenseCategory, Client client);

    List<AccountLimit> findByYearMonthDay(LocalDate date);

    void saveAll(List<AccountLimit> accountLimitForExpenseCategories);

    void flush();
}
