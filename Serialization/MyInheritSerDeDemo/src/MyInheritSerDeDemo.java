public class MyInheritSerDeDemo {
    public static void main(String[] args) {
        Serializer ser= new Serializer();
        DeSerializer deser = new DeSerializer();

//        Cat c = new Cat(10.0, "White");
//        ser.serializeCat(c);
//        deser.deserializeCat();

        UniversityEmployee u = new UniversityEmployee("Kamal",30, 10);
        ser.serializeUniversityEmployee(u);
        deser.deserializeUniversityEmployee();


    }
}
