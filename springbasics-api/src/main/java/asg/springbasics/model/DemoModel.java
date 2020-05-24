package asg.springbasics.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2203461567707702098L;
	private int modelId;
	private String modelName;
	private double doubleField = Double.MAX_VALUE;
	private BigDecimal bigDecimalField = BigDecimal.TEN;
	private List<DemoModelLink> demoModelLinks = new ArrayList<>();
	
	
	public DemoModel(int modelId, String modelName) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		demoModelLinks.add(new DemoModelLink(new Random().nextLong()));
		demoModelLinks.add(new DemoModelLink(new Random().nextLong()));
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	

}
