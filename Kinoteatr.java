
public class Kinoteatr {

String name_Kinoteatr;	
String address;
int numofzal;

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNumofzal() {
	return numofzal;
}
public void setNumofzal(int numofzal) {
	this.numofzal = numofzal;
}


public Kinoteatr(String name_Kinoteatr, String address, int numofzal){
	this.name_Kinoteatr=name_Kinoteatr;
	this.address=address;
	this.numofzal=numofzal;
}
public String getname_Kinoteatr() {
    return name_Kinoteatr;
}
public void setname_Kinoteatr(String name_Kinozal) {
    this.name_Kinoteatr=name_Kinozal;
}
@Override
public String toString() {
	return "Kinoteatr [name_Kinoteatr=" + name_Kinoteatr + ", address=" + address + ", numofzal=" + numofzal + "]";
}

}
