package com.voting;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.voting.implement.Voting;
import com.voting.implement.VotingController;
import com.voting.implement.VotingRepository;
import com.voting.implement.VotingService;

import jakarta.inject.Inject;

@SpringBootTest
class VotingApplicationTests {
	@InjectMocks
  private VotingService votingService;
	@Mock
  private VotingRepository votingRepository;
	

	@Test
	void contextLoads() {
	}
	@Test
	public void testSample() {
		  
	}
}
