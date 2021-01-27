package com.psl.training.inventory.exception;

import java.io.FileWriter;

public class CreateInvoiceFile {
	
	public void createInvoice(String filename,String invoice) {
		try {
		      // Creates a FileWriter
		      FileWriter output = new FileWriter(filename);

		      // Writes the string to the file
		      output.write(invoice);

		      // Closes the writer
		      output.close();
		    }

		    catch (Exception e) {
		      e.getStackTrace();
		    }
	}

}
