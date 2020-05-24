package asg.springbasics.service.impl;

import java.util.Arrays;
import java.util.List;

import asg.springbasics.model.DemoModel;

//import asg.springbasics.service.DemoService;

public class DemoServiceImpl implements DemoServiceServersideInterface {

	@Override
	public List<DemoModel> getDemoMessage() {

		return Arrays.asList(new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel1"),
				new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"),
				new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"),
				new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"), new DemoModel(1, "TestModel"));
	}

}
