package com.capgemini.bankapplication.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapplication.exception.InsufficientFundException;
import com.capgemini.bankapplication.model.BankAccount;
import com.capgemini.bankapplication.model.SavingBankAccount;

public class SavingBankAccountTest {

	private BankAccount account;

	@Before
	public void setUp() {
		account = new SavingBankAccount(100, "Jay", "SAVING", 45000, true);
	}

	@Test
	public void testSavingBankAccountObjectIsCreated() {
		BankAccount account = new SavingBankAccount();
		assertNotNull(account);
	}

	@Test
	public void testSavingBankAccountObjectIsCreatedWithParameterized() {
		BankAccount account = new SavingBankAccount(100, "Jay", "SAVING", 45000, true);
		assertEquals(100, account.getAccount());
		assertEquals("Jay", account.getAccountHolderName());
		assertEquals("SAVING", account.getAccountType());
		assertEquals(45000, account.getAccountBalance(), 0.01);
		assertEquals(true, ((SavingBankAccount) account).isSalaryAccount());
	}

	@Test
	public void testSavingBankAccountWithdrawWithSalaryAccount() {
		assertEquals(500, account.withdraw(44500), 0.01);
	}

	@Test
	public void testSavingBankAccountWithdrawWithSalaryAccountWithInsufficientFund() {
		assertEquals(45000, account.withdraw(45001), 0.01);
	}

	@Test
	public void testSavingBankAccountWithdrawWithNormalAccount() {
		BankAccount account = new SavingBankAccount(100, "Jay", "SAVING", 45000, false);
		assertEquals(1200, account.withdraw(43800), 0.01);
	}

	@Test(expected = InsufficientFundException.class)
	public void testSavingBankAccountWithdrawWithNormalAccountWithInsufficientFund() {
		BankAccount account = new SavingBankAccount(100, "Jay", "SAVING", 45000, false);
		assertEquals(45000, account.withdraw(44100), 0.01);
	}

	@Test
	public void testSavingBankAccountDeposit() {
		BankAccount account = new SavingBankAccount(100, "Jay", "SAVING", 45000, false);
		assertEquals(90000, account.deposit(45000), 0.01);
	}

}
