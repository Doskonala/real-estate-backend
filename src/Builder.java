
public class Builder implements Seller {
	private String name;
	private String address;
	private String phone;
	@Override
	public void viewSeller() {
		System.out.println("Купити квартиру від забудовника "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
