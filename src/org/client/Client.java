package org.client;

import org.company.Company;

public class Client extends Company{
	private void clientName() {
		System.out.println("Client Name is xyxy ");
	}
	public static void main(String[] args) {
		Client b = new Client();
		b.clientName();
		b.companyName();
	}

}
