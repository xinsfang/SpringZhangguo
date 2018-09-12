package demo;

import org.springframework.stereotype.Component;

@Component("person")
/**人*/
public abstract class Person {
    /**姓名*/
    public String name;
    /**地址*/
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
