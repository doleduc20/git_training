package test;

import Model.CounterModel;
import View.CounterView;

public class test {
public static void main(String[] args) {
CounterView ctv_1 = new CounterView();
	CounterModel ctm_1 = new CounterModel();
	ctm_1.increment();
	ctm_1.increment();
	ctm_1.getValue();
	
}
}
