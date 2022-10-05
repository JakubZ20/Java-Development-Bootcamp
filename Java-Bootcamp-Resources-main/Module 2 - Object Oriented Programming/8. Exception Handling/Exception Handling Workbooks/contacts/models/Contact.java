package models;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException
    {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("name can not be null or blank");
        }
        if(phoneNumber == null || name.isBlank()){
            throw new IllegalArgumentException("phone number can not be null or blank");
        }
        if(phoneNumber.length()<5){
            throw new IllegalArgumentException("phone number can not be less then 5 characters");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source)
    {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("name can not be null or blank");
        }
        this.name = name;
        
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || name.isBlank()){
            throw new IllegalArgumentException("phone number can not be null or blank");
        }
        if(phoneNumber.length()<5){
            throw new IllegalArgumentException("phone number can not be less then 5 characters");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));

    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge (String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)/365);
         // Date toDate = formatter.parse(birthDate); //converts String to date
        // long toMilli = toDate.getTime(); // convetrs date to miliseconds
    }


    public String toString() {
        return "Name: " + this.name + "\n" +
        "Phone number: " + this.phoneNumber + "\n" +
        "Birth Date: " + this.birthDate + "\n" +
        "Age: " +this.age + " year old\n";
    }




  
  
  

}
