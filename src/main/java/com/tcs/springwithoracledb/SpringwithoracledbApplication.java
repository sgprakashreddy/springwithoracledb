package com.tcs.springwithoracledb;

import com.tcs.springwithoracledb.entity.Contacts;
import com.tcs.springwithoracledb.repository.ContactsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringwithoracledbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringwithoracledbApplication.class, args);
		System.out.println("*******Application Started*******");

		ContactsRepository contactsRepository= ctx.getBean(ContactsRepository.class);

		Contacts contacts= new Contacts();
		contacts.setContactId(101);
		contacts.setContactName("testing");
		contacts.setContactNumber(12314143);
		//Saving to repository
			contactsRepository.save(contacts);
		ctx.close();
	}

}
