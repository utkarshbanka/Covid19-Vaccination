package com.covid.model;

public enum Slot {

		SLOT1("9.am-10.am"),SLOT2("10.am-11.am"),SLOT3("11.am-12.pm"),SLOT4("12.pm-01.pm"),SLOT5("01.pm-02.pm"),SLOT6("02.pm-03.pm"),SLOT7("03.pm-04.pm"),SLOT8("04.pm-05.pm"),SLOT9("05.pm-06.pm");
		
		String timeslot;
		
		private Slot() {
			// TODO Auto-generated constructor stub
		}
		
		private Slot(String tiString) {
			// TODO Auto-generated constructor stub
			this.timeslot=tiString;
		}
}
