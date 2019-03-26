package com.capgemini.inheritance.model;

public class PublicTraining extends Training {
	private int numberOfParticipants;

	public PublicTraining() {
		super();
	}

	public PublicTraining(int id, String subject, double fees, int numberOfParticipants) {
		super(id, subject, fees);
		this.numberOfParticipants = numberOfParticipants;
	}

	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	@Override
	public double getOrderValue() {
		return getFees() * numberOfParticipants;

	}
	
}