package com.ictec.serialization;

public class MyInheritSerializationDeserializationDemo {
    public static void main(String[] args) {

        Serializer sr = new Serializer();
        Deserializer dr = new Deserializer();

        Cat c = new Cat(10.0,"White");

        sr.SerializerCat(c);

        dr.DeserializerCat();

    }
}
