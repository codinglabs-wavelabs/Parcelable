package com.example.s.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    public String name;
    public String college;
    public String qualification;

    public Person(String name, String college, String qualification){
        this.name = name;
        this.college = college;
        this.qualification = qualification;
    }

    protected Person(Parcel parcel) {
        this.name = parcel.readString();
        this.college = parcel.readString();
        this.qualification = parcel.readString();

    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(this.name);
        parcel.writeString(this.college);
        parcel.writeString(this.qualification);
    }
}
