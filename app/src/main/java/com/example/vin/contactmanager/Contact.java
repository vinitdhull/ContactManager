package com.example.vin.contactmanager;

import android.net.Uri;

/**
 * Created by Vin on 11-06-2015.
 */
public class Contact {
    private String _name, _phone, _email, _address;
    private Uri _imageURI;
    private int _id;

    public Contact(int id,String name, String phone,String email, String address, Uri imageURI){
        _id = id;
        _name=name;
        _phone=phone;
        _email=email;
        _address=address;
        _imageURI = imageURI;
    }
    public int getId() { return _id; }
    public String getName(){
        return _name;
    }
    public String getPhone(){
        return _phone;
    }
    public String getEmail(){
return _email;
    }
    public String getAddress(){
return _address;
    }
    public Uri getImageURI(){ return _imageURI; }
}
