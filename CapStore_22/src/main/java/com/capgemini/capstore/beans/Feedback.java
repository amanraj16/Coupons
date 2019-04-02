package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Feedback")
@SequenceGenerator(name = "feedseq", initialValue = 1000, allocationSize = 500)
public class Feedback {

	@Id
	@Column(name = "feedbackId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feedseq")
	@NotNull
	private int feedbackId;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

}
