package com.psl.training.oop1.test;

import java.util.Random;

import com.psl.training.oop1.Medicine;
import com.psl.training.oop1.Ointment;
import com.psl.training.oop1.Syrup;
import com.psl.training.oop1.Tablet;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicines = new Medicine[10];
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			int num = rand.nextInt((3 - 1) + 1) + 1;
			switch(num) {
			case 1:
				medicines[i] = new Tablet();
				break;
			case 2:
				medicines[i] = new Syrup();
				break;
			case 3:
				medicines[i] = new Ointment();
				break;
			}			
		}
		for(Medicine med : medicines) {
			System.out.println(med.displayLabel());
		}

	}

}
