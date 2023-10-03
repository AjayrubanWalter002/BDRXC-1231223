package com.entityrelationship.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.entityrelationship.entity.AccountDetails;
import com.entityrelationship.repository.AccountDetailsRepo;

@RestController

public class AccountDetailsController {
	@Autowired
	AccountDetailsRepo repo;

	public String setAllAcounts(List<AccountDetails> account) {
		repo.saveAll(account);
		return "Saved the Account Details";
	}
}
