package Entities;
// default package
// Generated 12-may-2014 19:20:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Forwards generated by hbm2java
 */
public class ForwardsEntity implements java.io.Serializable {

	private ForwardsId id;
	private int authorId;
	private Date forwardDate;

	public ForwardsEntity() {
	}

	public ForwardsEntity(ForwardsId id, int authorId, Date forwardDate) {
		this.id = id;
		this.authorId = authorId;
		this.forwardDate = forwardDate;
	}

	public ForwardsId getId() {
		return this.id;
	}

	public void setId(ForwardsId id) {
		this.id = id;
	}

	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public Date getForwardDate() {
		return this.forwardDate;
	}

	public void setForwardDate(Date forwardDate) {
		this.forwardDate = forwardDate;
	}

}