package asg.springbasics.model;

import java.io.Serializable;

public class DemoModelLink implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 866630332327428046L;
	private String longString = "ihfcwdhkhjkshckjshdkhsdckhasdkjhckjshckjshdckhskcjhsdkjchksjhckjsdahckjshdk";
	private String anotherLongString = "asdjskjhskhjlksajdlkjaaaaa65465sa65d46s4f56sa4df654sad65f4asd654f65asd465f";
	private long linkId;

	public DemoModelLink(long linkId) {
		super();
		this.linkId = linkId;
	}

	public String getAnotherLongString() {
		return anotherLongString;
	}

}
